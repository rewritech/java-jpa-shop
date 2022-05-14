package jpabook.jpashop.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ORDERS")
public class Oder {
    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;

    private LocalDateTime oderDate;

    @Enumerated(EnumType.STRING)
    private OderStatus status;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getMemberId() {
//        return memberId;
//    }
//
//    public void setMemberId(Long memberId) {
//        this.memberId = memberId;
//    }
//
//    public LocalDateTime getOderDate() {
//        return oderDate;
//    }
//
//    public void setOderDate(LocalDateTime oderDate) {
//        this.oderDate = oderDate;
//    }
//
//    public OderStatus getStatus() {
//        return status;
//    }
//
//    public void setStatus(OderStatus status) {
//        this.status = status;
//    }
}
