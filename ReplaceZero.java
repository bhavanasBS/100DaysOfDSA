public class ReplaceZero {
   
        int convertfive(int num) {
            // Your code here
            int n;
            int nCount=0;
            int count=0;
           int temp=num;
           int temp2=num;
           if(num==0){
               return 5;
           }
           int modifiednum=0;
            while(temp!=0)
            {
                
                n=temp%10;
                temp/=10;
                nCount+=1;
                if(n==0){
                    count++;
                }
                
            }
            int CountNum=nCount-1;
            int result[]=new int[nCount];
            if(count > 0){
            int arr[]=new int[nCount];
            for(int j=nCount-1;j>=0;j-- ){
                n=temp2%10;
                temp2/=10;
                
              
              
              if(n == 0 ){
                  n=5;
              }
              arr[j]=n;
              
              
              
              
            }
            for(int i=0;i< nCount;i++){
                 modifiednum=modifiednum*10+arr[i];
              }
            return modifiednum;
        }
        
            return num;
        }
        }
        
        
    

