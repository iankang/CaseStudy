package com.queros.casestudy.Controllers;

import com.queros.casestudy.model.CharacterPositionResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;

/**
   RestController for handling sample input and returning Character Position.
 * @author Ian Kang'ethe
 * @version 1.0
 */

@RestController("/characters")
@Tag(
        name = "Task1 - Get Character Index",
        description = "Get Character and index for the input provided"
)
public class Task1Controller {

  @Operation(
          summary = "GetCharacter and Index"
  )
    @PostMapping("/getCharacterIndex")
    public LinkedList<String> PostCharacterIndex(@Parameter @RequestParam("input") String inputText){
        //parse the string into a char array.
        char[] chars = inputText.toCharArray();
        //use Linked List to retain order.
        LinkedList<String> characterPositionResponseList = new LinkedList<>();

        //cycle through each char and assign count to each char.
        for(int count = 0; count<chars.length; count++){
            CharacterPositionResponse characterPositionResponse = new CharacterPositionResponse(String.valueOf(chars[count]),count+1);
            characterPositionResponseList.add(characterPositionResponse.toString());
        }
        return characterPositionResponseList;
    }
}
