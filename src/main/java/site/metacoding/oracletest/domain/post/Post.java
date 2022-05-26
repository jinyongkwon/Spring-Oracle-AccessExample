package site.metacoding.oracletest.domain.post;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@SequenceGenerator(name = "Post_ID_GENERATOR", // Java에서 사용할 시퀀스 이름
        sequenceName = "Post_SEQUENCES", // DB에 등록하거나 혹은 등록되어있는 시퀀스 이름
        initialValue = 1, // 시퀀스의 시작 값
        allocationSize = 1 // 시퀀스를 호출할때마다 증가하는 값
)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Post_ID_GENERATOR" // 해당 시퀀스 이름의 시퀀스 사용
    )
    private Integer id;

    String username;
    String password;
}
