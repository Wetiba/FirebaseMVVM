package com.erick.login_registrationfirebase.model

class Upload{
    var name:String=""
    var quantity:String=""
    var price:String=""
    var imageUrl:String=""
    var id:String=""

    constructor(name:String,quantity:String,price:String,imageUrl:String,id:String){

        this.name=name
        this.quantity=quantity
        this.price=price
        this.imageUrl=imageUrl
        this.id=id

    }
    constructor()
}