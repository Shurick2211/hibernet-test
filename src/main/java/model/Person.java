package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;


@NoArgsConstructor
@Data
@ToString
@Entity
@Table (name = "persons")
public class Person {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
  @GenericGenerator (name = "native",strategy = "native")
  @Column (name = "id_person", nullable = false)
  private int idPerson;
  @Column
  private String name;
  @Column
  private int age;
  @Column
  private String email;
}
