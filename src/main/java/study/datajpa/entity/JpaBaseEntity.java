package study.datajpa.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

@MappedSuperclass //속성을 내려서 테이블에서 사용할 수 있게 설정
@Getter
public class JpaBaseEntity {

    @Column(updatable = false) //수정불가 설정
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    @PrePersist //persist 하기 전에 발생
    public void prePersist() {
        LocalDateTime now = LocalDateTime.now();
        createdDate = now;
        updatedDate = now;
    }

    @PreUpdate //update 하기 전에 발생
    public void preUpdate() {
        updatedDate = LocalDateTime.now();
    }

}
