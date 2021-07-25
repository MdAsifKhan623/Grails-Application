package webstore

class WishListController{
    def index(){
        redirect action:"list", id: params.customerId
    }
    def list(WishList wishes){
        [wishlist:wishes]
    }
}

