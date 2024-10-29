import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("path-to-your-api") // Sesuaikan dengan endpoint API yang valid
    fun getArticles(): Call<List<Article>>
}