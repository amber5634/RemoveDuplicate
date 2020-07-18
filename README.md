# RemoveDuplicate
> Method 1
# Using Set
In this program I am using Set which simply ignores the duplicate.

> If you know about Collection, Set, HashSet then one thing which you will know about Set is that it can not contain duplicate elements. 
 # Key point to remember about Set.
 * Set however don't have it's own method. That is why in order to create an object of Set we need to use HashSet as HashSet implements Set(which means it is inherited by HashSet).
 * To do so we use the below command

```Java
Set<> set=new HashSet<>();
```
* Here I'm taking integral values so that values will be passed as an argument to Set.
* The elements are added in the Set with the help of Set object and if duplicate elements are added it will return false which means the element will not be added to the Set. 

## But if you are Curious to know about why Set cannot contain duplicates value then visit the below site to read more about it

[Stackoverflow why Set can not contain duplicate value](https://stackoverflow.com/questions/20870879/why-set-is-not-allowed-duplicate-value-which-kind-of-mechanism-used-behind-them)

> Sooner I will update more method with and without using Collections.

> Hint ( It lies in the internal working of the set)
