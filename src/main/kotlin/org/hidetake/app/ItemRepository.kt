package org.hidetake.app

import org.springframework.data.repository.PagingAndSortingRepository

interface ItemRepository : PagingAndSortingRepository<Item, Long> {
}
