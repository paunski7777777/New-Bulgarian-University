����   4 �
 < f g h
  i j k l m n@�p     
 	 o@�|     @�h     @�@     @��      p q r s t@�0     @�      @�8     @��     @�0     
 	 u
  v w x
 & y z
 { |   � � �  �
 & �@.      
 & �@>      @$      
 & �@9      	 � �
 � � � �
 & �
 & �
 � �
 � �@��     
 & � � <init> ()V Code LineNumberTable LocalVariableTable this LMainClass; main ([Ljava/lang/String;)V i I args [Ljava/lang/String; 
employees1 [LEmployee; 	salaries1 [Ljava/lang/Double; 
employees2 	salaries2 company1 	LCompany; company2 StackMapTable Q S U lambda$main$1 (LCompany;LEmployee;)V e 
LEmployee; lambda$main$0 
SourceFile MainClass.java E F Employee Gosho E � Pesho Tosho Onzi Tozi be java/lang/Double � � Typiq Debeliq Mibeliq 	Batenceto 	Kotenceto � � � � Company Billions E � YYY bratlencata � � � BootstrapMethods � � � � � � � � � � � � � � � � � � � � � � $The sum of all salaries in %s is: %s java/lang/Object � � � � � � � � � � � 	MainClass (Ljava/lang/String;)V valueOf (D)Ljava/lang/Double; doubleValue ()D 	SetSalary (D)V (Ljava/lang/String;I)V java/util/Arrays stream .([Ljava/lang/Object;)Ljava/util/stream/Stream;
 � � (Ljava/lang/Object;)V
 D � (LEmployee;)V accept ((LCompany;)Ljava/util/function/Consumer; java/util/stream/Stream forEach  (Ljava/util/function/Consumer;)V
 D � FireEmployees IncreaseAllSalaries IncreaseSalaryOnCurrentEmployee (LEmployee;D)V java/lang/System out Ljava/io/PrintStream; java/io/PrintStream println getName ()Ljava/lang/String; GetSumOfAllSalaries java/lang/String format 9(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String; HireEmployees � � � c ` _ ` "java/lang/invoke/LambdaMetafactory metafactory � Lookup InnerClasses �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; � %java/lang/invoke/MethodHandles$Lookup java/lang/invoke/MethodHandles ! D <       E F  G   /     *� �    H        I        J K   	 L M  G      �� Y� Y� SY� Y� SY� Y� SY� Y� SY� Y� SL� 	Y 
� SY � SY � SY � SY � SM� Y� Y� SY� Y� SY� Y� SY� Y� SY� Y� SN� 	Y � SY � SY � SY  � SY "� S:6,�� +2,2� $� %����6�� -22� $� %���� &Y'
� (:� &Y)� (:+� *� +  � , -� *� -  � , +2� .-2� . /� 1 2� 1+2 4� 6-2 7� 6� 9� :� 9� :� 9;� <Y� =SY� >� S� ?� @� 9;� <Y� =SY� >� S� ?� @�    H   � #   - A 5 J 7 S 8 \ 9 e : n ; s > � F � H � I � J � K � L � O � P � O S T S% [2 \> ^N _^ af bn dv e~ g� h� j� k� m� n� o I   \ 	 �  N O   N O   � P Q   A� R S  sv T U  �5 V S  � W U 2 � X Y > � Z Y  [   # � �  \ ] ^ ] ^  � � � 
 _ `  G   =     	*+ A� C�    H       _ I       	 Z Y     	 a b 
 c `  G   =     	*+ 
� C�    H       ^ I       	 X Y     	 a b   d    e �   
  � � �  }     ~   � � ~   � �