import java.util.*
import kotlin.reflect.typeOf

enum class EntityType {
   HELP, EASY, MEDIUM, HARD;
    
    fun getFormattedName () = name.toLowerCase().capitalize()
}

object EntityFactory {
    fun create (type: EntityType) : Entity {
      val id = UUID.randomUUID().toString()
        val name = when(type) {
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> "Hard"
            EntityType.HELP ->type.getFormattedName()
        }
        return when (type) {
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard (id, name, multiplier =  2f)
            EntityType.HELP ->Entity.Help
        }

    }
}


sealed class Entity () {
    object Help :Entity () {
        val name = "Help"
    }
    data class Easy (val id: String, val name: String):Entity ()
    data class Medium (val id: String, val name: String):Entity ()
    data class Hard (val id: String, val name: String, val multiplier: Float):Entity ()
    }

 fun main() {
    val entity1 = EntityFactory.create(EntityType.EASY)
     val entity2 = EntityFactory.create(EntityType.EASY)

     if (entity1 == entity2) {
         println("they are equal")
         } else {
         println("they are not equal")
     }

 }