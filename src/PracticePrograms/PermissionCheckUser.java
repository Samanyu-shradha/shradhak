package PracticePrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PermissionCheckUser {

    public void checkPermissionOfUser(String permUser) throws Exception{
        int counter=0;
        List<String> listPerms = new ArrayList<>();
        listPerms.add("createOrderViewPermission");
        listPerms.add("createOrderSubmitPermission");
        listPerms.add("authOrderViewPermission");
        listPerms.add("authOrderSubmitPermission");
        listPerms.add("debitViewPermission");
        listPerms.add("creditViewPermission");
        listPerms.add("debitSubmitPermission");
        listPerms.add("creditSubmitPermission");
        listPerms.add("payPalCreditViewPermission");
        listPerms.add("standAloneCreditViewPermission");
        listPerms.add("directDebitViewPermission");

        System.out.println("The permissions are: "+listPerms);

//        Iterator iterator = listPerms.iterator();
//        while(iterator.hasNext()){
//            String currentPerm=iterator.next().toString();
//            if(permUser.equalsIgnoreCase(currentPerm)){
//                System.out.println("The user is permitted to perform the operation");
//                counter+=1;
//                break;
//            }
//        }

        for(String s: listPerms){
            if(permUser.equalsIgnoreCase(s)){
                System.out.println("The user is permitted to perform the operation");
                counter+=1;
                break;
            }
        }

        if(counter==0){
            System.out.println("The user doesnn't have permission to perform the operation");
        }



    }

    public static void main(String[] args) throws Exception{
        PermissionCheckUser permObj = new PermissionCheckUser();
        permObj.checkPermissionOfUser("createOrderSugbmitPermission");
    }
}
