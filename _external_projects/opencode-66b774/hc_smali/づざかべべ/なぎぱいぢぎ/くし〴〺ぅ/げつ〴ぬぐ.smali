.class public Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〺つふすそ:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;

.field public ぁごぐすすぃ:I

.field public くし〴〺ぅ:I

.field public げつ〴ぬぐ:Ljava/lang/String;

.field public づざかべべ:Ljava/lang/String;

.field public なぎぱいぢぎ:Z

.field public びぐびあび:F


# direct methods
.method public constructor <init>(Ljava/lang/String;Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;Ljava/lang/Object;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    iput-object p2, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-virtual {p0, p3}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->〳ぜぞぜべっ(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;Ljava/lang/Object;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    iput-object v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    iget-object p1, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;

    iput-object p1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-virtual {p0, p2}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->〳ぜぞぜべっ(Ljava/lang/Object;)V

    return-void
.end method

.method public static げつ〴ぬぐ(I)I
    .registers 2

    shr-int/lit8 v0, p0, 0x1f

    xor-int/lit8 v0, v0, -0x1

    and-int/2addr p0, v0

    add-int/lit16 p0, p0, -0xff

    shr-int/lit8 v0, p0, 0x1f

    and-int/2addr p0, v0

    add-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static づざかべべ(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;Ljava/util/HashMap;)V
    .registers 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lorg/xmlpull/v1/XmlPullParser;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;->〳ぜぞぜべっ:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-static {p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object p1

    sget-object v1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->CustomAttribute:[I

    invoke-virtual {p0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, v3

    move-object v5, v4

    const/4 v6, 0x0

    :goto_15
    if-ge v6, v1, :cond_c1

    invoke-virtual {p1, v6}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v7

    sget v8, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->CustomAttribute_attributeName:I

    const/4 v9, 0x1

    if-ne v7, v8, :cond_49

    invoke-virtual {p1, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_bd

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_bd

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v8

    invoke-static {v8}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_bd

    :cond_49
    sget v8, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->CustomAttribute_customBoolean:I

    if-ne v7, v8, :cond_59

    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    sget-object v5, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;->ぁごぐすすぃ:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;

    goto/16 :goto_bd

    :cond_59
    sget v8, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->CustomAttribute_customColorValue:I

    if-ne v7, v8, :cond_60

    sget-object v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;

    goto :goto_66

    :cond_60
    sget v8, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->CustomAttribute_customColorDrawableValue:I

    if-ne v7, v8, :cond_6b

    sget-object v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;->づざかべべ:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;

    :goto_66
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v5

    goto :goto_ab

    :cond_6b
    sget v8, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->CustomAttribute_customPixelDimension:I

    const/4 v10, 0x0

    if-ne v7, v8, :cond_81

    invoke-virtual {p1, v7, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    invoke-static {v9, v4, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v4

    goto :goto_89

    :cond_81
    sget v8, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->CustomAttribute_customDimension:I

    if-ne v7, v8, :cond_8f

    invoke-virtual {p1, v7, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    :goto_89
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    move-object v5, v0

    goto :goto_bd

    :cond_8f
    sget v8, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->CustomAttribute_customFloatValue:I

    if-ne v7, v8, :cond_a0

    sget-object v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;->くし〴〺ぅ:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;

    const/high16 v5, 0x7fc00000    # Float.NaN

    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    goto :goto_ba

    :cond_a0
    sget v8, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->CustomAttribute_customIntegerValue:I

    if-ne v7, v8, :cond_b0

    sget-object v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;

    const/4 v5, -0x1

    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v5

    :goto_ab
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_ba

    :cond_b0
    sget v8, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->CustomAttribute_customStringValue:I

    if-ne v7, v8, :cond_bd

    sget-object v4, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;->なぎぱいぢぎ:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-virtual {p1, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_ba
    move-object v11, v5

    move-object v5, v4

    move-object v4, v11

    :cond_bd
    :goto_bd
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_15

    :cond_c1
    if-eqz v3, :cond_cd

    if-eqz v4, :cond_cd

    new-instance p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;

    invoke-direct {p0, v3, v5, v4}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;-><init>(Ljava/lang/String;Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;Ljava/lang/Object;)V

    invoke-virtual {p2, v3, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_cd
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static なぎぱいぢぎ(Landroid/view/View;Ljava/util/HashMap;)V
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;

    const-string v4, "set"

    invoke-static {v4, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :try_start_24
    iget-object v4, v3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    packed-switch v4, :pswitch_data_e6

    goto :goto_c

    :pswitch_30
    new-array v4, v6, [Ljava/lang/Class;

    sget-object v7, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v7, v4, v5

    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v4, v6, [Ljava/lang/Object;

    iget v3, v3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->びぐびあび:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    aput-object v3, v4, v5

    invoke-virtual {v2, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    :pswitch_48
    new-array v4, v6, [Ljava/lang/Class;

    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v7, v4, v5

    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v4, v6, [Ljava/lang/Object;

    iget-boolean v3, v3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->なぎぱいぢぎ:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v4, v5

    invoke-virtual {v2, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    :pswitch_60
    new-array v4, v6, [Ljava/lang/Class;

    const-class v7, Ljava/lang/CharSequence;

    aput-object v7, v4, v5

    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v4, v6, [Ljava/lang/Object;

    iget-object v3, v3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->づざかべべ:Ljava/lang/String;

    aput-object v3, v4, v5

    invoke-virtual {v2, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    :pswitch_74
    new-array v4, v6, [Ljava/lang/Class;

    const-class v7, Landroid/graphics/drawable/Drawable;

    aput-object v7, v4, v5

    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-instance v4, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    iget v3, v3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->ぁごぐすすぃ:I

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/ColorDrawable;->setColor(I)V

    new-array v3, v6, [Ljava/lang/Object;

    aput-object v4, v3, v5

    invoke-virtual {v2, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_c

    :pswitch_91
    new-array v4, v6, [Ljava/lang/Class;

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v7, v4, v5

    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v4, v6, [Ljava/lang/Object;

    iget v3, v3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->ぁごぐすすぃ:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v4, v5

    invoke-virtual {v2, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_c

    :pswitch_aa
    new-array v4, v6, [Ljava/lang/Class;

    sget-object v7, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v7, v4, v5

    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v4, v6, [Ljava/lang/Object;

    iget v3, v3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->びぐびあび:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    aput-object v3, v4, v5

    invoke-virtual {v2, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_c

    :pswitch_c3
    new-array v4, v6, [Ljava/lang/Class;

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v7, v4, v5

    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v4, v6, [Ljava/lang/Object;

    iget v3, v3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->くし〴〺ぅ:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v4, v5

    invoke-virtual {v2, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_da
    .catch Ljava/lang/NoSuchMethodException; {:try_start_24 .. :try_end_da} :catch_dc
    .catch Ljava/lang/IllegalAccessException; {:try_start_24 .. :try_end_da} :catch_e0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_24 .. :try_end_da} :catch_e0

    goto/16 :goto_c

    :catch_dc
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/NoSuchMethodException;->getMessage()Ljava/lang/String;

    :catch_e0
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    goto/16 :goto_c

    :cond_e5
    return-void

    :pswitch_data_e6
    .packed-switch 0x0
        :pswitch_c3
        :pswitch_aa
        :pswitch_91
        :pswitch_74
        :pswitch_60
        :pswitch_48
        :pswitch_30
    .end packed-switch
.end method


# virtual methods
.method public 〳ぜぞぜべっ(Ljava/lang/Object;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_34

    goto :goto_32

    :pswitch_a
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->なぎぱいぢぎ:Z

    goto :goto_32

    :pswitch_13
    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->づざかべべ:Ljava/lang/String;

    goto :goto_32

    :pswitch_18
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->びぐびあび:F

    goto :goto_32

    :pswitch_21
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->くし〴〺ぅ:I

    goto :goto_32

    :pswitch_2a
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->ぁごぐすすぃ:I

    :goto_32
    return-void

    nop

    :pswitch_data_34
    .packed-switch 0x0
        :pswitch_21
        :pswitch_18
        :pswitch_2a
        :pswitch_2a
        :pswitch_13
        :pswitch_a
        :pswitch_18
    .end packed-switch
.end method

.method public 〺つふすそ()F
    .registers 3

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_30

    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    :pswitch_c
    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->びぐびあび:F

    return v0

    :pswitch_f
    iget-boolean v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->なぎぱいぢぎ:Z

    if-eqz v0, :cond_16

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_17

    :cond_16
    const/4 v0, 0x0

    :goto_17
    return v0

    :pswitch_18
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Cannot interpolate String"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_20
    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->びぐびあび:F

    return v0

    :pswitch_23
    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->くし〴〺ぅ:I

    int-to-float v0, v0

    return v0

    :pswitch_27
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Color does not have a single color to interpolate"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_30
    .packed-switch 0x0
        :pswitch_23
        :pswitch_20
        :pswitch_27
        :pswitch_27
        :pswitch_18
        :pswitch_f
        :pswitch_c
    .end packed-switch
.end method

.method public ぁごぐすすぃ(Landroid/view/View;[F)V
    .registers 15

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "set"

    invoke-static {v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :try_start_13
    iget-object v2, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v3, 0x3

    const/4 v4, 0x2

    const-wide v5, 0x3fdd1745d1745d17L    # 0.45454545454545453

    const/high16 v7, 0x437f0000    # 255.0f

    const/4 v8, 0x1

    const/4 v9, 0x0

    packed-switch v2, :pswitch_data_160

    goto/16 :goto_15f

    :pswitch_29
    new-array v2, v8, [Ljava/lang/Class;

    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v9

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v8, [Ljava/lang/Object;

    aget p2, p2, v9

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    aput-object p2, v1, v9

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_15f

    :pswitch_42
    new-array v2, v8, [Ljava/lang/Class;

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v9

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v8, [Ljava/lang/Object;

    aget p2, p2, v9

    const/high16 v2, 0x3f000000    # 0.5f

    cmpl-float p2, p2, v2

    if-lez p2, :cond_57

    goto :goto_58

    :cond_57
    const/4 v8, 0x0

    :goto_58
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    aput-object p2, v1, v9

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_15f

    :pswitch_63
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unable to interpolate strings "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_7c
    new-array v2, v8, [Ljava/lang/Class;

    const-class v10, Landroid/graphics/drawable/Drawable;

    aput-object v10, v2, v9

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    aget v1, p2, v9

    float-to-double v1, v1

    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float v1, v1, v7

    float-to-int v1, v1

    invoke-static {v1}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ(I)I

    move-result v1

    aget v2, p2, v8

    float-to-double v10, v2

    invoke-static {v10, v11, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v10

    double-to-float v2, v10

    mul-float v2, v2, v7

    float-to-int v2, v2

    invoke-static {v2}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ(I)I

    move-result v2

    aget v4, p2, v4

    float-to-double v10, v4

    invoke-static {v10, v11, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    double-to-float v4, v4

    mul-float v4, v4, v7

    float-to-int v4, v4

    invoke-static {v4}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ(I)I

    move-result v4

    aget p2, p2, v3

    mul-float p2, p2, v7

    float-to-int p2, p2

    invoke-static {p2}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ(I)I

    move-result p2

    shl-int/lit8 p2, p2, 0x18

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr p2, v1

    shl-int/lit8 v1, v2, 0x8

    or-int/2addr p2, v1

    or-int/2addr p2, v4

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    invoke-virtual {v1, p2}, Landroid/graphics/drawable/ColorDrawable;->setColor(I)V

    new-array p2, v8, [Ljava/lang/Object;

    aput-object v1, p2, v9

    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_15f

    :pswitch_d6
    new-array v2, v8, [Ljava/lang/Class;

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v10, v2, v9

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    aget v1, p2, v9

    float-to-double v1, v1

    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float v1, v1, v7

    float-to-int v1, v1

    invoke-static {v1}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ(I)I

    move-result v1

    aget v2, p2, v8

    float-to-double v10, v2

    invoke-static {v10, v11, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v10

    double-to-float v2, v10

    mul-float v2, v2, v7

    float-to-int v2, v2

    invoke-static {v2}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ(I)I

    move-result v2

    aget v4, p2, v4

    float-to-double v10, v4

    invoke-static {v10, v11, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    double-to-float v4, v4

    mul-float v4, v4, v7

    float-to-int v4, v4

    invoke-static {v4}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ(I)I

    move-result v4

    aget p2, p2, v3

    mul-float p2, p2, v7

    float-to-int p2, p2

    invoke-static {p2}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->げつ〴ぬぐ(I)I

    move-result p2

    shl-int/lit8 p2, p2, 0x18

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr p2, v1

    shl-int/lit8 v1, v2, 0x8

    or-int/2addr p2, v1

    or-int/2addr p2, v4

    new-array v1, v8, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v1, v9

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_15f

    :pswitch_12b
    new-array v2, v8, [Ljava/lang/Class;

    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v9

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v8, [Ljava/lang/Object;

    aget p2, p2, v9

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    aput-object p2, v1, v9

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_15f

    :pswitch_143
    new-array v2, v8, [Ljava/lang/Class;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v2, v9

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v8, [Ljava/lang/Object;

    aget p2, p2, v9

    float-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v1, v9

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_15b
    .catch Ljava/lang/NoSuchMethodException; {:try_start_13 .. :try_end_15b} :catch_15c
    .catch Ljava/lang/IllegalAccessException; {:try_start_13 .. :try_end_15b} :catch_15c
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_13 .. :try_end_15b} :catch_15f

    goto :goto_15f

    :catch_15c
    invoke-static {p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->げがぴうあだ(Landroid/view/View;)Ljava/lang/String;

    :catch_15f
    :goto_15f
    return-void

    :pswitch_data_160
    .packed-switch 0x0
        :pswitch_143
        :pswitch_12b
        :pswitch_d6
        :pswitch_7c
        :pswitch_63
        :pswitch_42
        :pswitch_29
    .end packed-switch
.end method

.method public くし〴〺ぅ([F)V
    .registers 12

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_6c

    goto :goto_6a

    :pswitch_b
    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->びぐびあび:F

    aput v0, p1, v1

    goto :goto_6a

    :pswitch_10
    iget-boolean v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->なぎぱいぢぎ:Z

    if-eqz v0, :cond_17

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_18

    :cond_17
    const/4 v0, 0x0

    :goto_18
    aput v0, p1, v1

    goto :goto_6a

    :pswitch_1b
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Color does not have a single color to interpolate"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_23
    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->びぐびあび:F

    aput v0, p1, v1

    goto :goto_6a

    :pswitch_28
    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->くし〴〺ぅ:I

    int-to-float v0, v0

    aput v0, p1, v1

    goto :goto_6a

    :pswitch_2e
    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->ぁごぐすすぃ:I

    shr-int/lit8 v2, v0, 0x18

    and-int/lit16 v2, v2, 0xff

    shr-int/lit8 v3, v0, 0x10

    and-int/lit16 v3, v3, 0xff

    shr-int/lit8 v4, v0, 0x8

    and-int/lit16 v4, v4, 0xff

    and-int/lit16 v0, v0, 0xff

    int-to-float v3, v3

    const/high16 v5, 0x437f0000    # 255.0f

    div-float/2addr v3, v5

    float-to-double v6, v3

    const-wide v8, 0x400199999999999aL    # 2.2

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    double-to-float v3, v6

    int-to-float v4, v4

    div-float/2addr v4, v5

    float-to-double v6, v4

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    double-to-float v4, v6

    int-to-float v0, v0

    div-float/2addr v0, v5

    float-to-double v6, v0

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    double-to-float v0, v6

    aput v3, p1, v1

    const/4 v1, 0x1

    aput v4, p1, v1

    const/4 v1, 0x2

    aput v0, p1, v1

    const/4 v0, 0x3

    int-to-float v1, v2

    div-float/2addr v1, v5

    aput v1, p1, v0

    :goto_6a
    return-void

    nop

    :pswitch_data_6c
    .packed-switch 0x0
        :pswitch_28
        :pswitch_23
        :pswitch_2e
        :pswitch_2e
        :pswitch_1b
        :pswitch_10
        :pswitch_b
    .end packed-switch
.end method

.method public びぐびあび()I
    .registers 3

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_e

    const/4 v1, 0x3

    if-eq v0, v1, :cond_e

    const/4 v0, 0x1

    return v0

    :cond_e
    const/4 v0, 0x4

    return v0
.end method
