package Java_8;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {
    public static void main(String[] args) {
        List<Customers> customersList = CustomerDataBase.getCustomerDetatils();

        //one to one mapping where
        List<String> emails = customersList.stream().map(customers -> customers.getEmail()).collect(Collectors.toList());
        System.out.println(emails);


        //on to many mapping with map
        List<List<String>> phoneNumbers = customersList.stream().map(customers -> customers.getPhoneNumber()).collect(Collectors.toList());
        System.out.println(phoneNumbers);

        //one to many mapping with flatmap
        List<String> phoneNums = customersList.stream().flatMap(customers -> customers.getPhoneNumber().stream()).collect(Collectors.toList());
        System.out.println(phoneNums);


    }
}
