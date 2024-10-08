package org.example.designpatterns;

import org.example.designpatterns.creational.builder.Allocation;
import org.example.designpatterns.creational.builder.User;
import org.example.designpatterns.creational.builder.UserDto;
import org.junit.jupiter.api.Test;

public class BuilderTest {
    @Test
    public void Test(){
        User user=createUser();
        UserDto userDto=UserDto.getBuilder()
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withEmail(user.getEmail())
                .withAge(user.getAge())
                .build();
        Allocation allocation=Allocation.getAllocationBuilder().withDealId(4).build();
    }

    private User createUser(){
        User user=new User(); //usually it comes from db.
        user.setFirstName("Abhinav");
        user.setLastName("Kasam");
        user.setAddress("Bellampally");
        user.setEmail("ak@gmail.com");
        user.setAge(25);
        return user;
    }
}
