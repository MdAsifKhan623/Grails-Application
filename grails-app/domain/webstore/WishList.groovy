package webstore

class WishList{
    Integer customerId
    Integer wishNo
    static hasMany =[products: Products]

    static constraints={
        customerId nullable:false
        wishNo nullable:false
    }

    String toString(){
        customerId
    }
}
