package webstore

class WishList{
    Integer wishlistId
    Integer customerId
    String products

    static constraints={
        wishlistId nullable:false, unique:true
        customerId nullable:false

    }

    String toString(){
        wishlistId
    }
}
