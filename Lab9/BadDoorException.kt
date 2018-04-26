class BadDoorException : Throwable {
    constructor(num: Int) : super("Door $num does not exist!")
}