package org.hidetake.app

import javax.persistence.*

@Entity
class Item(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0,

    @Column(nullable = false)
    var name: String = "",

    @Column(nullable = false)
    var description: String = ""

)
