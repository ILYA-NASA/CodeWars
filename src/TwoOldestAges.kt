fun twoOldestAges(ages: List<Int>) = listOf(ages.sorted()[ages.size - 2], ages.maxOf { it })
// fun twoOldestAges(ages: List<Int>) = ages.sorted().takeLast(2)
