public class Jump_game_array {
    public static void main(String[] args) {
        int[] nums = {0};
        int jump = 0;
        if(jump== nums.length)
        {
            System.out.println(true);
        }
        jump =1;
        while(jump< nums.length)
        {
            if (jump== nums.length-1)
            {
                System.out.println("true");
                break;
            }
            else
            {
                if(nums[jump]==0)
                {
                    break;
                }
                jump += nums[jump];
            }
        }
        System.out.println("sup");

    }
}
