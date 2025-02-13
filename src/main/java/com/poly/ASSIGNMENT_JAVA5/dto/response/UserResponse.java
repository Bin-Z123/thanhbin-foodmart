package com.poly.ASSIGNMENT_JAVA5.dto.response;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.poly.ASSIGNMENT_JAVA5.entity.Address;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String username;
    String password;
    String email;
    String fullname;
    Boolean role;
    String avatar;
    List<Address> addressList;
}
