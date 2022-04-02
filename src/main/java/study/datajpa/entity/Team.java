package study.datajpa.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "name"})
public class Team extends JpaBaseEntity{

    @Id @GeneratedValue
    @Column(name = "team_id")
    private Long id;
    private String name;

    @OneToMany(mappedBy = "team") //mappedBy : foriegn key가 없는 쪽에 작성하는 것이 좋다.
    private List<Member> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }
}
