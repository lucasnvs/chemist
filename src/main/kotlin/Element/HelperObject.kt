package Element

object HelperObject {
    private val levelOne = Level(
        1, listOf(
            SubLevel(1, "s", 2)
        )
    )
    private val levelTwo = Level(
        2, listOf(
            SubLevel(2, "s", 2), SubLevel(3, "p", 6)
        )
    )
    private val levelThree = Level(
        3, listOf(
            SubLevel(4, "s", 2), SubLevel(5, "p", 6), SubLevel(7, "d", 10)
        )
    )
    private val levelFour = Level(
        4, listOf(
            SubLevel(6, "s", 2), SubLevel(8, "p", 6), SubLevel(10, "d", 10), SubLevel(13, "f", 14)
        )
    )
    private val levelFive = Level(
        5, listOf(
            SubLevel(9, "s", 2), SubLevel(11, "p", 6), SubLevel(14, "d", 10), SubLevel(17, "f", 14)
        )
    )
    private val levelSix = Level(
        6, listOf(
            SubLevel(12, "s", 2), SubLevel(15, "p", 6), SubLevel(18, "d", 10)
        )
    )
    private val levelSeven = Level(
        7, listOf(
            SubLevel(16, "s", 2), SubLevel(19, "p", 6)
        )
    )

    val levels = listOf(
        levelOne, levelTwo, levelThree, levelFour, levelFive, levelSix, levelSeven
    )

    val elementsMap: Map<Int, String> = mapOf(
        Pair(1, "Hidrogênio"),
        Pair(2, "Hélio"),
        Pair(3, "Lítio"),
        Pair(4, "Berílio"),
        Pair(5, "Boro"),
        Pair(6, "Carbono"),
        Pair(7, "Nitrogênio"),
        Pair(8, "Oxigênio"),
        Pair(9, "Flúor"),
        Pair(10, "Neônio"),
        Pair(11, "Sódio"),
        Pair(12, "Magnésio"),
        Pair(13, "Alumínio"),
        Pair(14, "Silício"),
        Pair(15, "Fósforo"),
        Pair(16, "Enxofre"),
        Pair(17, "Cloro"),
        Pair(18, "Argônio"),
        Pair(19, "Potássio"),
        Pair(20, "Cálcio"),
        Pair(21, "Escântio"),
        Pair(22, "Titânio"),
        Pair(23, "Vanádio"),
        Pair(24, "Cromo"),
        Pair(25, "Manganês"),
        Pair(26, "Ferro"),
        Pair(27, "Cobalto"),
        Pair(28, "Níquel"),
        Pair(29, "Cobre"),
        Pair(30, "Zinco"),
        Pair(31, "Gálio"),
        Pair(32, "Germânio"),
        Pair(33, "Arsênio"),
        Pair(34, "Selênio"),
        Pair(35, "Bromo"),
        Pair(36, "Criptônio"),
        Pair(37, "Rubídio"),
        Pair(38, "Estrôncio"),
        Pair(39, "Ítrio"),
        Pair(40, "Zircônio"),
        Pair(41, "Nióbio"),
        Pair(42, "Molibdênio"),
        Pair(43, "Tecnécio"),
        Pair(44, "Rutênio"),
        Pair(45, "Ródio"),
        Pair(46, "Paládio"),
        Pair(47, "Prata"),
        Pair(48, "Cádmio"),
        Pair(49, "Índio"),
        Pair(50, "Estanho"),
        Pair(51, "Antimônio"),
        Pair(52, "Telúrio"),
        Pair(53, "Iodo"),
        Pair(54, "Xenônio"),
        Pair(55, "Césio"),
        Pair(56, "Bário"),
        Pair(57, "Lantânio"),
        Pair(58, "Cério"),
        Pair(59, "Praseodímio"),
        Pair(60, "Neodímio"),
        Pair(61, "Promécio"),
        Pair(62, "Samário"),
        Pair(63, "Euródio"),
        Pair(64, "Gadólinio"),
        Pair(65, "Terbio"),
        Pair(66, "Disprósio"),
        Pair(67, "Hólmio"),
        Pair(68, "Érbio"),
        Pair(69, "Túlio"),
        Pair(70, "Ytterbio"),
        Pair(71, "Lutécio"),
        Pair(72, "Háfnio"),
        Pair(73, "Tântalo"),
        Pair(74, "Tungstênio"),
        Pair(75, "Rênio"),
        Pair(76, "Ósmio"),
        Pair(77, "Irídio"),
        Pair(78, "Platina"),
        Pair(79, "Ouro"),
        Pair(80, "Mercúrio"),
        Pair(81, "Tálio"),
        Pair(82, "Chumbo"),
        Pair(83, "Bismuto"),
        Pair(84, "Polônio"),
        Pair(85, "Astato"),
        Pair(86, "Radônio"),
        Pair(87, "Francício"),
        Pair(88, "Rádio"),
        Pair(89, "Actínio"),
        Pair(90, "Tório"),
        Pair(91, "Protactínio"),
        Pair(92, "Urânio"),
        Pair(93, "Neptúnio"),
        Pair(94, "Plutônio"),
        Pair(95, "Amerício"),
        Pair(96, "Cúrio"),
        Pair(97, "Berkélio"),
        Pair(98, "Califórnio"),
        Pair(99, "Einstênio"),
        Pair(100, "Fér mio"),
        Pair(101, "Mendelevio"),
        Pair(102, "Nobelio"),
        Pair(103, "Lawrencio"),
        Pair(104, "Rutherfórdio"),
        Pair(105, "Dubnio"),
        Pair(106, "Seabórgio"),
        Pair(107, "Bohrio"),
        Pair(108, "Hassio"),
        Pair(109, "Meitnerio"),
        Pair(110, "Darmstádio"),
        Pair(111, "Roentgênio"),
        Pair(112, "Copernício"),
        Pair(113, "Nihônio"),
        Pair(114, "Fleróvio"),
        Pair(115, "Moscóvio"),
        Pair(116, "Livermório"),
        Pair(117, "Tennesso"),
        Pair(118, "Oganessônio")
    )
}