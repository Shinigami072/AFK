//package AFK.demo;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "skill", uniqueConstraints = {@UniqueConstraint(columnNames = {"username"})})
//
//public class Skill {
//    @Id
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user.username")
//    private User user;
//
//
//}