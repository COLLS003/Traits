class Rational(n: Int, d: Int){
    // adding a required field to ensure no error is throwm 
    require(d != 0)
    // initialise the parameters 
    var numerator: Int = n
    var denominator: Int = d
    override def toString = n +"/"+d
    // define a add functuin that takes another rational make sure it dose not add iteself 
    def add(that: Rational): Rational = 
        new Rational(
            (numerator * that.denominator) +(denominator * that.numerator), (denominator * that.denominator)

        )
    
}