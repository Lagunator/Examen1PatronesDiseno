package interpreterTemplate;

import java.util.ArrayList;
import java.util.List;

public class NonTerminalExpression {

    private List<AbstractExpression> grammar = new ArrayList<>();
    private Context context;

    public NonTerminalExpression (String input){
        context = new Context(input.replace(" ",""));
        for (String charInput :input.split(" ")){
            switch (charInput.toUpperCase()){
                case "A":
                    grammar.add(new TerminalExpressionA());
                    break;
                case "B":
                    grammar.add(new TerminalExpressionB());
                    break;
                case "C":
                    grammar.add(new TerminalExpressionC());
                    break;
                case "D":
                default:
                    break;
            }

        }
    }

    public String outputMessage(){
        for (AbstractExpression expression:grammar){
            expression.interpreter(context);
        }
        return context.output;
    }

}
