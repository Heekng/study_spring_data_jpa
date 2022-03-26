package study.datajpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Member {

    @Id
    @GeneratedValue
    private Long id;
    private String username;

    protected Member() {;} //jpa가 프록시 기술을 사용할 때 (하이버네이트 등 ..) 프라이빗으로 막아두면 막혀버림

    public Member(String username) {
        this.username = username;
    }
}
