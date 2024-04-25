package woowacourse.movie.repository

import woowacourse.movie.domain.movie.Movie
import woowacourse.movie.domain.movie.Screen

interface ScreenListRepository {
    val list: List<Screen>

    fun listSize(): Int

    fun addToList(movie: Movie)

    fun addToList(screen: Screen)

    fun addToList(movieList: List<Movie>)

    fun findOrNull(id: Long): Screen?
}
