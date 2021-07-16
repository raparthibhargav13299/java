## Write a pseudocode for displaying the largest number of the given array {7,8,5,6}.
```
begin
numeric num[i]={7,8,5,6}
numeric large,i
large=num[0]
for(i=1,i<4,i++)
{
    if (num[i]>large)
    {
        large=num[i]
        display largest number
    }
}
end
```


## Write a pseudocode to display the element that occurs most frequently in the given array {7,7,7,7,8,8,8,5,5,5,5,6,6,6,6,}.

```
begin
numeric num[i]={7,7,7,7,8,8,8,5,5,5,5,6,6,6,6,}
numeric element=0,count=0
for(i=0;i<15;i++)
{
  tempElement=num[i]
  tempcount=0
    for(j=0;j<15;j++)
            {
                if (num[i]==tempElement)
                 {
                  tempcount++
                 }

                if(tempcount>count)
                {
                 element=tempElement
                 count=tempcount
                }
            display the most frquent element  
            }
}

end
```
## Write a pseudocode to count duplicate values in an array of size 10.

```
 begin
	numeric a[10]={1,2,3,4,5,6,6,8,9,9}
	numeric count=0
	numeric i,k;
	for( i=0;i<10,i++)

	begin
		for (k=i+1;k<10;k++)
	begin
		if(a[k]==a[i])
	begin
		display "duplicate element;"
		display a[k]
		count=count+1
		end
	end
end
	display "The number of duplicate values in the array are"
	display count
end
```


## Write a pseudocode to calculate the average of the elements in the given array of size 10.
```
begin
numeric num[10]
numeric sum=0,avg
for(i=0;i<10;i++)
{
    sum=sum+num[i]

}
avg=sum/10
display avg
end
```


## Write a pseudocode to display the sum of two matrix having size 3.
```
begin
numeric num[3][3],b[3][3],c[3][3],i,j
display enter 1st matrix  elements
for(i=0;i<3;i++)
{
    for(j=0;j<3;j++)
     {
         display the matrix elements into i,j
         accept the matrix elements into a[i][j]
     }
}
display enter 2nd matrix elements
for(i=0;i<3;i++)
{
    for(j=0;j<3;j++)
    {
    display the matrix elements into i,j
    accept the matrix elements into a[i]a[j]
    }
}
for(i=0;i<3;i++)
{
    for(j=0;j<3;j++)
    {
        c[i][j]=a[i][j]+b[i][j]
        display the sum of two matrices
    }
}
end
```

## Write a pseudocode to arrange the elements of array in ascending order. {4,3,8,7,6,1,2,9,4}
```
begin
numeric num[9]={4,3,8,7,6,1,2,9,4}
numeric i,j
for (i=0;i<8;i++)
{
    for(j=0;j<8;j++)
    {
        if (num[j]>num[j+1])
        {
            temp=num[j]
            num[j]=num[j+1]
            num[j+1]=temp
            display elements in ascending order
        }
    }
}
end
```
## Write a pseudocode to display all the numbers in given array greater than the average of numbers given in an array of size 10.
```
begin
	numeric array[10]
	numeric sum, average,i

	display "Enter the elements of the array"
	for (i=0;i<10;i=i+1)
	{
		accept array [i]
    }
	for (i=0;i<10;i=i+1);
	{
		sum=sum+array[i];
    }
	average=sum/10;
	display "The numbers greater than the average of the given array are:"
	for (i=0;i<10;i++)
	{
		if (array[i]>average)
		{
			display array[i]
        }
    }
end
```


## Write a pseudocode to concatenate two arrays containing elements in ascending order to create a new array containing elements in ascending order.
```
 begin
	numeric x=0, y=0, z=0, i
	numeric array1[]={1,2,3,4}
	numeric array2[]={5,6,7,8}
	numeric concatarray[8]
	while(x<=3 && y<=3)
	{
		if(array1[x]< array2[y])
		{
			concatarray[z]=array1[x];
			x=x+1
        }
		else
		{
			concatarray[z]=array2[y],
			y=y+1
        }
		z=z++
    }
	while(x<4)
	{
		concatarray[z]=array1[x]
		x++
		Z++
    }
	while(y<4)
	{
		concatarray[z]=array2[y]
		y++
		z++
    }
	display " The concatenated array is:"
	for(i=0;i<8;i++)
	{
		display concatearray[i]
    }
end



```
## Write a pseudocode to accept two numbers from a user and then, add and subtract these numbers with the help of two procedures, Add and Subtract. Define the Add and Subtract procedures to accomplish the required functionality.
```
procedure add
numeric num1,num2

begin 
accept num1,num2
call add 
end

procedure add
begin
numeric result
result=num1+num2
display result
end

`````````````````````````````
procedure subtract
numeric num1,num2

begin
accept num1,num2
call subtract

procedure subtract
begin
numeric result
result=num1-num2
display result
end
```

## Write a pseudocode that contains two modules, Accept and FindSmallest, to accept three numbers from the user and to display the smallest number.
```
procedure smallest
numeric num1,num2,num3

begin 
accept num1
accept num2
accept num3
call smallest
end

procedure smallest
begin
numeric smallest
if(num1 < num2 && num1 < num3)
	{
		 smallest = display "num1 is the smallest"
	}
else if(num2 < num3 && num2 < num1) 
	{
		smallest = display "num2 is the smallest"
	}
else
	{
		smallest = display "num3 is the smallest"
	}	

display smallest
end

``````````````````````````````````````
function smallest
numeric num1,num2,num3,nsmall

begin
accept num1
accept num2
accept num3
nsmall=call smallest
display nsmall
end

function smallest
begin
numeric smallest
if(num1 < num2 && num1 < num3)
	{
		 smallest = display "num1 is the smallest"
	}
else if(num2 < num3 && num2 < num1) 
	{
		smallest = display "num2 is the smallest"
	}
else
	{
		smallest = display "num3 is the smallest"
	}	
return smallest
end

```
## Write a pseudocode to create a procedure which will calculate and print all leap years between the range 2000 and 3000.
```
procedure compute
numeric num1,num2,i

begin 
accept min year
accept max year
call compute
end

procedure compute
begin
numeric result
for (i=min year;i<=max year;i++)
{
	if ((i%4==0&&i%100!=0)||(i%400==0))
	{
		 result =display i is leap year
	}
  else i is not a leap year
}
display result
end
```

## Write a pseudocode to create a procedure to compare two strings without using String functions.
```
procedure compute
numeric str1[i],str2[i]
numeric difference,i=0


begin
display enter 1st string
accept 1st string
display enter 2nd string
accept 2nd string
call compute
end

procedure compute
begin
numeric compute
while(str1[i]!='\0'|| str2[i]!='\0')
{
	diff =(str1[i]-str2[i])
	  if(diff!=0)
	   break
    i++
}
if (diff>0)
{
	result= "str1 comes after str2"
}
if (diff<0)
{
	result = "str2 comes after str1"
}
if (diff==0)
{
    result= "both the strings are equal"
}
display result
end
```


## Write a pseudocode to implement transpose of matrix.
```
begin
numeric a[i][j],i,j
display enter 1st matrix elements
accept 1st matrix elements
for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	if(i<j)
	{
		temp =a[i][j]
		a[i][j]=a[j][i]
		a[j][i]=temp
	}
}
end
```
## Write a pseudocode to convert binary number to decimal number.
```
begin
numeric decimal=0,digit=0,place=1,counter=1
while(digit!=-1)
{
	digit=input("enter digit" counter)
	decimal=decimal + (place*digit)
	place=place*2
	counter=counter+1
}
display decimal
end
```
## Write a pseudocode to find power of a number using function recursion.
```
begin
numeric base,exponent

begin
display"enter base value"
accept base
display"enter exponent value"
accept expo
result = call pow(base,expo)
display result
end

function pow(base,expo)
 if(expo == 0)
 {
        return 1;
    else
        return base * getPower(base, expo- 1);
}