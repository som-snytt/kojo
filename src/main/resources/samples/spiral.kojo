def spiral(size: Int, angle: Int) {
    if (size <= 300) {
        forward(size)
        right(angle)
        spiral(size + 2, angle)
    }
}
clear()
setPenColor(darkGray)
setFillColor(green)
setBackgroundH(red, yellow)
setPenThickness(1)
setAnimationDelay(0)
spiral(0, 91)
