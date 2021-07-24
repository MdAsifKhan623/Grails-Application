package webstore

class AdminController{

    def index() {
        redirect action: "list"
    }
    def create() {}
    def save(Admin admin) {

        admin.save flush:true, failOnError:true
        redirect action:"show", id: admin.id

    }
    def edit() {

        def product= Products.get(params.productId)
        [product:Products]

    }
    def update() {

        def product = Products.get(params.productId)
        product.properties = params
        product.save flush: true, failOnError: true
        redirect action: "show", id: params.productId

    }
    def show() {
        def product = Products.get(params.productId)
        [product: Products]
    }
    def list() {
        def product = Products.list()
        [product:Products]
    }
    def delete() {
        def product = Products.get(params.productId)
        product.delete flush: true, failOnError: true
        redirect action: "index"
    }

}
