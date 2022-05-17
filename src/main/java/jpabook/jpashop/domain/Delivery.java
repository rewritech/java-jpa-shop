package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Delivery {
    @Id @GeneratedValue
    private Long id;

    private String name;
    private String city;
    private String street;
    private String zipcode;
    private String status;

    @OneToOne(mappedBy = "delivery")
    private Order order;

}
