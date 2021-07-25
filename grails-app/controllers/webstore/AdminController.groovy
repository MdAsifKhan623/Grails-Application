package webstore

import javax.validation.constraints.Null

class AdminController{

    def index() {
//        redirect action: "login"

    }
    def find(Admin adminData){
        if (adminData.adminName != Null){
            println(adminData.adminName)
        }
        redirect action: "list"
    }

    def login(Admin adminData){
        def admin=Admin.list()
        admin.each{adm-> println(adm.adminName+" "+adm.password)}
    }

    def create() {}

    def save(Products product) {

        product.save failOnError:true
        redirect action:"show", id: product.id

    }
    def edit() {

        def product= Products.get(params.id)
        [products:product]

    }
    def update(Products products) {

        println(products.productType)

        products.save failOnError: true
        redirect action: "show", id: products.id

    }
    def show(Products product) {
//        def product = Products.get(params.productId)
        [products: product]
    }
    def list() {

        def products = Products.list()
        [products:products]
    }
    def delete() {
        def product = Products.get(params.id)
        product.delete failOnError: true
        redirect action: "list"
    }

}
