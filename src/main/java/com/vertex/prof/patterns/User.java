package com.vertex.prof.patterns;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class User {

    private String name;
    private String address;
    private String phone;
    private List<User> friends = new ArrayList<>();

    private User(){}

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
    public List<User> getFriends() {
        return new ArrayList<>(friends);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", friends=").append(friends);
        sb.append('}');
        return sb.toString();
    }

    public static class Builder{
        private User instance;
        boolean builded = false;

        public Builder(){
            instance = new User();
        }

        public Builder withName(String name){
            instance.name = name;
            return this;
        }

        public Builder withAddress(String address){
            instance.address = address;
            return this;
        }

        public Builder withPhone(String phone){
            instance.phone = phone;
            return this;
        }

        public Builder withFriend(@NotNull User user){
            if(user != null) {
                instance.friends.add(user);
            }
            return this;
        }

        public Builder withFriends(@NotNull Collection<User> friends){
            instance.friends.addAll(friends);
            return this;
        }

        public User build(){
            if(!builded) {
                builded = true;
                return instance;
            } else {
                throw new UnsupportedOperationException("Build can be called only once. Please create new Builder");
            }
        }
    }

    public static void main(String[] args) {
        Builder builder = new Builder();
        User user = builder
                .withName("Vasia")
                .withName("Petia")
                .withAddress("Mechnikova, 16")
                .build();

        System.out.println(user);

        User user2 = builder.withPhone("102").build();
        System.out.println(user2);

    }

}
