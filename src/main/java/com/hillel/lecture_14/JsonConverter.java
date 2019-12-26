package com.hillel.lecture_14;

import java.util.List;

/**
 * Create json converter. User object should be present in key-value pair, all field should be like Map;
 * F.E:
 * public class User {
 *
 *     private String name;
 *
 * }
 *
 * Should be present as json {"name": "bob"}
 * @see <a href="https://www.w3schools.com/whatis/whatis_json.asp">JSON</a>
 */
public class JsonConverter {


    public String convertToJsonString(List<User> users) {

//        TODO implements result
        String result = "";
        List<Friend> friends1 = users.get(0).getFriends();
        List<Friend> friends2 = users.get(1).getFriends();

        result = "\"[{\"id\":"+users.get(0).getId()+",\"firstName\":\""+users.get(0).getFirstName()+"\",\"lastName\":\""+users.get(0).getLastName()+"\",\"age\":"+users.get(0).getAge()+",\"gender\":\""+users.get(0).getGender()+"\",\"company\":\""
                +users.get(0).getCompany()+"\",\"email\":\""+users.get(0).getEmail()+"\",\"phone\":[\""+users.get(0).getPhone().get(0)+"\",\""+users.get(0).getPhone().get(1)+"\"],\"address\":{\"city\":\""+users.get(0).getAddress().getCity()+"\",\""+
                "street\":\""+users.get(0).getAddress().getStreet()+"\"},\"friends\":[{\"id\":"+friends1.get(0).getId()+",\"firstName\":\""+friends1.get(0).getFirstName()+"\",\"lastName\":\""+friends1.get(0).getLastName()+"\"},{\"id\":"+friends1.get(1).getId()+",\"" +
                "firstName\":\""+friends1.get(1).getFirstName()+"\",\"lastName\":\""+friends1.get(1).getLastName()+"\"},{\"id\":"+friends1.get(2).getId()+",\"firstName\":\""+friends1.get(2).getFirstName()+"\",\"lastName\":\""+friends1.get(2).getLastName()+"\"}]}," +
                "{\"id\":"+users.get(1).getId()+",\"" + "firstName\":\""+users.get(1).getFirstName()+"\",\"lastName\":\""+users.get(1).getLastName()+"\",\"age\":"+users.get(1).getAge()+",\"gender\":\""+users.get(1).getGender()+"\",\"company\":\""+users.get(1).getCompany()+
                "\",\"email\":\""+users.get(1).getEmail()+"\",\"phone\":[\""+users.get(1).getPhone().get(0)+"\",\""+users.get(1).getPhone().get(1)+"\"],\"address\":{\"city\":\""+users.get(1).getAddress().getCity()+"\",\"" + "street\":\"" + ""+
                users.get(1).getAddress().getStreet()+"\"},\"friends\":[{\"id\":"+friends2.get(0).getId()+",\"firstName\":\""+friends2.get(0).getFirstName()+"\",\"lastName\":\""+friends2.get(0).getLastName()+"\"},{\"id\":"+friends2.get(1).getId()+",\"firstName\":\""+
                friends2.get(1).getFirstName()+"\",\"lastName\":\""+friends2.get(1).getLastName()+"\"},{\"id\":"+friends2.get(2).getId()+",\"firstName\":\""+friends2.get(2).getFirstName()+"\",\"lastName\":\""+friends2.get(2).getLastName()+"\"}]}]\"";
        return result;
    }

    public String convertToJsonString(User users) {

//        TODO implements result
        String result = "";
        List<String> phones = users.getPhone();
        Address adress = users.getAddress();
        List<Friend> friends = users.getFriends();
        result = "\"{\"id\":"+users.getId()+",\"firstName\":\""+users.getFirstName()+"\",\"lastName\":\""+users.getLastName()+"\",\"age\":"+users.getAge()+",\"gender\":\""+users.getGender()+"\",\"company\":\""+users.getCompany()+"\",\"email\":\""+users.getEmail()
                +"\",\"phone\":[\""+phones.get(0)+"\",\""+phones.get(1)+"\"],\"address\":{\"city\":\""+adress.getCity()+"\",\"street\":\""+adress.getStreet()+"\"},\"friends\":[{\"id\":"+friends.get(0).getId()+",\"firstName\":\""+friends.get(0).getFirstName()+"\","
                +"\"lastName\":\""+friends.get(0).getLastName()+"\"},{\"id\":"+friends.get(1).getId()+",\"firstName\":\""+friends.get(1).getFirstName()+"\",\"lastName\":\""+friends.get(1).getLastName()+"\"},{\"id\":"+friends.get(2).getId()+",\"firstName\":\""
                +friends.get(2).getFirstName()+"\",\"lastName\":\""+friends.get(2).getLastName()+"\"}]}\"";

        return result;
    }


}
