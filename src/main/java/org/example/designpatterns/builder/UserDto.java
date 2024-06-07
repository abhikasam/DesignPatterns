package org.example.designpatterns.builder;

public class UserDto {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getAddress(){
        return this.address;
    }
    public String getEmail(){
        return this.email;
    }
    public int getAge(){
        return this.age;
    }
    private void setFirstName(String firstName){
        this.firstName=firstName;
    }
    private void setLastName(String lastName){
        this.lastName=lastName;
    }
    private void setAddress(String address){
        this.address=address;
    }
    private void setEmail(String email){
        this.email=email;
    }
    private void setAge(int age){
        this.age=age;
    }
    public static class UserDtoBuilder{
        private String firstName;
        private String lastName;
        private String address;
        private String email;
        private int age;
        private UserDto userDto;
        public UserDtoBuilder withFirstName(String firstName){
            this.firstName=firstName;
            return this;
        }
        public UserDtoBuilder withLastName(String lastName){
            this.lastName=lastName;
            return this;
        }
        public UserDtoBuilder withAddress(String address){
            this.address=address;
            return this;
        }
        public UserDtoBuilder withEmail(String email){
            this.email=email;
            return this;
        }
        public UserDtoBuilder withAge(int age){
            this.age=age;
            return this;
        }

        public UserDto build(){
            userDto=new UserDto();
            userDto.setFirstName(this.firstName);
            userDto.setLastName(this.lastName);
            userDto.setAddress(this.address);
            userDto.setEmail(this.email);
            userDto.setAge(this.age);
            return userDto;
        }
        public UserDto getUserDto(){
            return userDto;
        }
    }
}
