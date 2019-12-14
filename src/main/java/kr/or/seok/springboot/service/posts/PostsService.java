package kr.or.seok.springboot.service.posts;

import kr.or.seok.springboot.domain.posts.Posts;
import kr.or.seok.springboot.domain.posts.PostsRepository;
import kr.or.seok.springboot.web.dto.PostsResponseDto;
import kr.or.seok.springboot.web.dto.PostsSaveRequestDto;
import kr.or.seok.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시물이 존재하지 않습니다. id=" + id));
        posts.update(requestDto.getTitle(), requestDto.getContent());
        return id;
    }

    public PostsResponseDto findById(Long id) {
        Posts entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시물이 존재하지 않습니다. id=" + id));
        return new PostsResponseDto(entity);
    }
}
