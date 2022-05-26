package site.metacoding.oracletest.web;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.oracletest.domain.post.Post;
import site.metacoding.oracletest.domain.post.PostRepository;
import site.metacoding.oracletest.domain.user.UserRepository;
import site.metacoding.oracletest.domain.user.Users;

@RequiredArgsConstructor
@Controller
public class TestController {

    private final UserRepository userRepository;
    private final PostRepository postRepository;

    @GetMapping("/")
    @Transactional
    public @ResponseBody List<Users> test() {
        Users user = new Users();
        user.setUsername("ssar");
        user.setPassword("1234");
        userRepository.save(user);
        return userRepository.findAll();
    }

    @GetMapping("/1")
    @Transactional
    public @ResponseBody List<Post> test1() {
        Post post = new Post();
        post.setUsername("ssar");
        post.setPassword("1234");
        postRepository.save(post);
        return postRepository.findAll();
    }

}
