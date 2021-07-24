package webstore

class Admin {

    Integer id
    String adminName
    String password

    static constraints = {
        adminName nullable: false
        password nullable: false
        id nullable:false, unique: true
    }
    String toString(){
        adminName
    }
}
