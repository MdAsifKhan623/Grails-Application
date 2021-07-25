package webstore

class Admin {

    String adminName
    String password

    static constraints = {
        adminName nullable: false
        password nullable: false
    }
    String toString(){
        adminName
    }
}
