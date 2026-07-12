import java.util.ArrayList;
import java.util.List;

public class _22_gen_par {
    private List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        String current = "";
        int openRemaining = n;
        int CL = n;
        next(current, openRemaining, CL);
        return result;
    }

    public void next(String current, int openRemaining, int closeRemaining){
        if(openRemaining==0 && closeRemaining==0){
            result.add(current);
            return;
        }
        if(openRemaining!=0){
            next(current + '(', openRemaining-1, closeRemaining);
        }
        if(openRemaining<closeRemaining){
            next(current + ')', openRemaining, closeRemaining-1);
        }
    }
}
