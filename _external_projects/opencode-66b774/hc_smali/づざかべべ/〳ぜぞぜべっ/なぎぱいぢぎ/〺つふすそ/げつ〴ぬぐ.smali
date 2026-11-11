.class public final Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final 〺つふすそ:Landroid/content/res/ColorStateList;

.field public くし〴〺ぅ:I

.field public final げつ〴ぬぐ:Landroid/graphics/Shader;


# direct methods
.method public constructor <init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/graphics/Shader;

    iput-object p2, p0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;->〺つふすそ:Landroid/content/res/ColorStateList;

    iput p3, p0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;->くし〴〺ぅ:I

    return-void
.end method

.method public static げつ〴ぬぐ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;
    .registers 31

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual/range {p0 .. p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v2

    invoke-static {v2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v3

    :goto_c
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-eq v4, v6, :cond_17

    if-eq v4, v5, :cond_17

    goto :goto_c

    :cond_17
    if-ne v4, v6, :cond_287

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    const-string v7, "gradient"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const/4 v9, 0x0

    if-nez v8, :cond_5d

    const-string v5, "selector"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3f

    invoke-static {v0, v2, v3, v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->ざっざへづ(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object v0

    .line 1
    new-instance v1, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v2

    invoke-direct {v1, v9, v0, v2}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object v1

    .line 2
    :cond_3f
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": unsupported complex color tag "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3
    :cond_5d
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_269

    sget-object v4, Lづざかべべ/〳ぜぞぜべっ/びぐびあび;->GradientColor:[I

    invoke-static {v0, v1, v3, v4}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぺぁあねじ(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v4

    sget v7, Lづざかべべ/〳ぜぞぜべっ/びぐびあび;->GradientColor_android_startX:I

    const-string v8, "startX"

    .line 4
    invoke-static {v2, v8}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v8

    const/4 v10, 0x0

    if-nez v8, :cond_7a

    const/4 v12, 0x0

    goto :goto_7f

    :cond_7a
    invoke-virtual {v4, v7, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    move v12, v7

    .line 5
    :goto_7f
    sget v7, Lづざかべべ/〳ぜぞぜべっ/びぐびあび;->GradientColor_android_startY:I

    const-string v8, "startY"

    .line 6
    invoke-static {v2, v8}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_8b

    const/4 v13, 0x0

    goto :goto_90

    :cond_8b
    invoke-virtual {v4, v7, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    move v13, v7

    .line 7
    :goto_90
    sget v7, Lづざかべべ/〳ぜぞぜべっ/びぐびあび;->GradientColor_android_endX:I

    const-string v8, "endX"

    .line 8
    invoke-static {v2, v8}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_9c

    const/4 v14, 0x0

    goto :goto_a1

    :cond_9c
    invoke-virtual {v4, v7, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    move v14, v7

    .line 9
    :goto_a1
    sget v7, Lづざかべべ/〳ぜぞぜべっ/びぐびあび;->GradientColor_android_endY:I

    const-string v8, "endY"

    .line 10
    invoke-static {v2, v8}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_ad

    const/4 v15, 0x0

    goto :goto_b2

    :cond_ad
    invoke-virtual {v4, v7, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    move v15, v7

    .line 11
    :goto_b2
    sget v7, Lづざかべべ/〳ぜぞぜべっ/びぐびあび;->GradientColor_android_centerX:I

    const-string v8, "centerX"

    .line 12
    invoke-static {v2, v8}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_be

    const/4 v7, 0x0

    goto :goto_c2

    :cond_be
    invoke-virtual {v4, v7, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    .line 13
    :goto_c2
    sget v8, Lづざかべべ/〳ぜぞぜべっ/びぐびあび;->GradientColor_android_centerY:I

    const-string v11, "centerY"

    .line 14
    invoke-static {v2, v11}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_ce

    const/4 v8, 0x0

    goto :goto_d2

    :cond_ce
    invoke-virtual {v4, v8, v10}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v8

    .line 15
    :goto_d2
    sget v11, Lづざかべべ/〳ぜぞぜべっ/びぐびあび;->GradientColor_android_type:I

    const-string v9, "type"

    .line 16
    invoke-static {v2, v9}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v9

    const/4 v6, 0x0

    if-nez v9, :cond_df

    const/4 v9, 0x0

    goto :goto_e3

    :cond_df
    invoke-virtual {v4, v11, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v9

    .line 17
    :goto_e3
    sget v11, Lづざかべべ/〳ぜぞぜべっ/びぐびあび;->GradientColor_android_startColor:I

    const-string v5, "startColor"

    .line 18
    invoke-static {v2, v5}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_ef

    const/4 v5, 0x0

    goto :goto_f3

    :cond_ef
    invoke-virtual {v4, v11, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v5

    :goto_f3
    const-string v11, "centerColor"

    .line 19
    invoke-static {v2, v11}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v18

    sget v10, Lづざかべべ/〳ぜぞぜべっ/びぐびあび;->GradientColor_android_centerColor:I

    .line 20
    invoke-static {v2, v11}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_103

    const/4 v10, 0x0

    goto :goto_107

    :cond_103
    invoke-virtual {v4, v10, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v10

    .line 21
    :goto_107
    sget v11, Lづざかべべ/〳ぜぞぜべっ/びぐびあび;->GradientColor_android_endColor:I

    const-string v6, "endColor"

    .line 22
    invoke-static {v2, v6}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_113

    const/4 v11, 0x0

    goto :goto_11a

    :cond_113
    const/4 v6, 0x0

    invoke-virtual {v4, v11, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v23

    move/from16 v11, v23

    .line 23
    :goto_11a
    sget v6, Lづざかべべ/〳ぜぞぜべっ/びぐびあび;->GradientColor_android_tileMode:I

    const-string v0, "tileMode"

    .line 24
    invoke-static {v2, v0}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_126

    const/4 v6, 0x0

    goto :goto_12b

    :cond_126
    const/4 v0, 0x0

    invoke-virtual {v4, v6, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    .line 25
    :goto_12b
    sget v0, Lづざかべべ/〳ぜぞぜべっ/びぐびあび;->GradientColor_android_gradientRadius:I

    move/from16 v20, v7

    const-string v7, "gradientRadius"

    .line 26
    invoke-static {v2, v7}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぁごぐすすぃ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_139

    const/4 v0, 0x0

    goto :goto_13e

    :cond_139
    const/4 v7, 0x0

    invoke-virtual {v4, v0, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    .line 27
    :goto_13e
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 28
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v4

    const/4 v7, 0x1

    add-int/2addr v4, v7

    new-instance v7, Ljava/util/ArrayList;

    move/from16 v21, v0

    const/16 v0, 0x14

    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(I)V

    move/from16 v22, v8

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v0}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v0, p0

    move/from16 v24, v15

    :goto_15b
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v15

    move/from16 v25, v14

    const/4 v14, 0x1

    if-eq v15, v14, :cond_1d6

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v14

    move/from16 v26, v13

    if-ge v14, v4, :cond_16f

    const/4 v13, 0x3

    if-eq v15, v13, :cond_1d8

    :cond_16f
    const/4 v13, 0x2

    if-eq v15, v13, :cond_173

    goto :goto_1d1

    :cond_173
    if-gt v14, v4, :cond_1cf

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v13

    const-string v14, "item"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_182

    goto :goto_1d1

    :cond_182
    sget-object v13, Lづざかべべ/〳ぜぞぜべっ/びぐびあび;->GradientColorItem:[I

    invoke-static {v0, v1, v3, v13}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ;->ぺぁあねじ(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v13, Lづざかべべ/〳ぜぞぜべっ/びぐびあび;->GradientColorItem_android_color:I

    invoke-virtual {v0, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v14

    sget v15, Lづざかべべ/〳ぜぞぜべっ/びぐびあび;->GradientColorItem_android_offset:I

    invoke-virtual {v0, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v27

    if-eqz v14, :cond_1b4

    if-eqz v27, :cond_1b4

    const/4 v14, 0x0

    invoke-virtual {v0, v13, v14}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v13

    const/4 v14, 0x0

    invoke-virtual {v0, v15, v14}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v15

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1cf

    :cond_1b4
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": <item> tag requires a \'color\' attribute and a \'offset\' attribute!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1cf
    :goto_1cf
    move-object/from16 v0, p0

    :goto_1d1
    move/from16 v14, v25

    move/from16 v13, v26

    goto :goto_15b

    :cond_1d6
    move/from16 v26, v13

    :cond_1d8
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1e4

    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ;

    invoke-direct {v0, v8, v7}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ;-><init>(Ljava/util/List;Ljava/util/List;)V

    goto :goto_1e5

    :cond_1e4
    const/4 v0, 0x0

    :goto_1e5
    if-eqz v0, :cond_1e9

    :goto_1e7
    const/4 v1, 0x1

    goto :goto_1f5

    .line 29
    :cond_1e9
    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ;

    if-eqz v18, :cond_1f1

    invoke-direct {v0, v5, v10, v11}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ;-><init>(III)V

    goto :goto_1e7

    :cond_1f1
    invoke-direct {v0, v5, v11}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ;-><init>(II)V

    goto :goto_1e7

    :goto_1f5
    if-eq v9, v1, :cond_22b

    const/4 v2, 0x2

    if-eq v9, v2, :cond_21d

    .line 30
    new-instance v3, Landroid/graphics/LinearGradient;

    iget-object v4, v0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ;->げつ〴ぬぐ:[I

    iget-object v0, v0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ;->〺つふすそ:[F

    if-eq v6, v1, :cond_20a

    if-eq v6, v2, :cond_207

    .line 31
    sget-object v1, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    goto :goto_20c

    :cond_207
    sget-object v1, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    goto :goto_20c

    :cond_20a
    sget-object v1, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    :goto_20c
    move-object/from16 v18, v1

    move-object v11, v3

    move/from16 v13, v26

    move/from16 v14, v25

    move/from16 v15, v24

    move-object/from16 v16, v4

    move-object/from16 v17, v0

    .line 32
    invoke-direct/range {v11 .. v18}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    goto :goto_259

    :cond_21d
    new-instance v3, Landroid/graphics/SweepGradient;

    iget-object v1, v0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ;->げつ〴ぬぐ:[I

    iget-object v0, v0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ;->〺つふすそ:[F

    move/from16 v7, v20

    move/from16 v8, v22

    invoke-direct {v3, v7, v8, v1, v0}, Landroid/graphics/SweepGradient;-><init>(FF[I[F)V

    goto :goto_259

    :cond_22b
    move/from16 v7, v20

    move/from16 v8, v22

    const/4 v1, 0x0

    cmpg-float v1, v21, v1

    if-lez v1, :cond_261

    new-instance v3, Landroid/graphics/RadialGradient;

    iget-object v1, v0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ;->げつ〴ぬぐ:[I

    iget-object v0, v0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ;->〺つふすそ:[F

    const/4 v2, 0x1

    if-eq v6, v2, :cond_246

    const/4 v2, 0x2

    if-eq v6, v2, :cond_243

    .line 33
    sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    goto :goto_248

    :cond_243
    sget-object v2, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    goto :goto_248

    :cond_246
    sget-object v2, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    :goto_248
    move-object/from16 v22, v2

    move-object/from16 v16, v3

    move/from16 v17, v7

    move/from16 v18, v8

    move/from16 v19, v21

    move-object/from16 v20, v1

    move-object/from16 v21, v0

    .line 34
    invoke-direct/range {v16 .. v22}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 35
    :goto_259
    new-instance v0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v3, v1, v2}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object v0

    .line 36
    :cond_261
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "<gradient> tag requires \'gradientRadius\' attribute with radial type"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_269
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": invalid gradient color tag "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 37
    :cond_287
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v1, "No start tag found"

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    goto :goto_290

    :goto_28f
    throw v0

    :goto_290
    goto :goto_28f
.end method


# virtual methods
.method public 〺つふすそ()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/graphics/Shader;

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    goto :goto_7

    :cond_6
    const/4 v0, 0x0

    :goto_7
    return v0
.end method

.method public くし〴〺ぅ()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/graphics/Shader;

    if-nez v0, :cond_10

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;->〺つふすそ:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_10

    const/4 v0, 0x1

    goto :goto_11

    :cond_10
    const/4 v0, 0x0

    :goto_11
    return v0
.end method

.method public びぐびあび([I)Z
    .registers 4

    invoke-virtual {p0}, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;->くし〴〺ぅ()Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;->〺つふすそ:Landroid/content/res/ColorStateList;

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    iget v0, p0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;->くし〴〺ぅ:I

    if-eq p1, v0, :cond_18

    const/4 v0, 0x1

    iput p1, p0, Lづざかべべ/〳ぜぞぜべっ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ;->くし〴〺ぅ:I

    goto :goto_19

    :cond_18
    const/4 v0, 0x0

    :goto_19
    return v0
.end method
