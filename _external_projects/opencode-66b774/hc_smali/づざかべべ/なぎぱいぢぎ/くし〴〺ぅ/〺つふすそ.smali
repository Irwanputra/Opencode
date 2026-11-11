.class public Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$〺つふすそ;,
        Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〺つふすそ:I

.field public くし〴〺ぅ:I

.field public final げつ〴ぬぐ:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public づざかべべ:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u304f\u3057\u3034\u303a\u3045;",
            ">;"
        }
    .end annotation
.end field

.field public びぐびあび:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u303a\u3064\u3075\u3059\u305d$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/constraintlayout/widget/ConstraintLayout;I)V
    .registers 11

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ;->〺つふすそ:I

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ;->くし〴〺ぅ:I

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ;->びぐびあび:Landroid/util/SparseArray;

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ;->づざかべべ:Landroid/util/SparseArray;

    iput-object p2, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p2

    :try_start_20
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result p3

    const/4 v1, 0x0

    :goto_25
    const/4 v2, 0x1

    if-eq p3, v2, :cond_a2

    if-eqz p3, :cond_9a

    const/4 v3, 0x2

    if-eq p3, v3, :cond_2f

    goto/16 :goto_9d

    :cond_2f
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/4 v5, 0x4

    const/4 v6, 0x3

    sparse-switch v4, :sswitch_data_a4

    goto :goto_6f

    :sswitch_3d
    const-string v4, "Variant"

    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6f

    const/4 p3, 0x3

    goto :goto_70

    :sswitch_47
    const-string v4, "layoutDescription"

    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6f

    const/4 p3, 0x0

    goto :goto_70

    :sswitch_51
    const-string v4, "StateSet"

    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6f

    const/4 p3, 0x1

    goto :goto_70

    :sswitch_5b
    const-string v4, "State"

    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6f

    const/4 p3, 0x2

    goto :goto_70

    :sswitch_65
    const-string v4, "ConstraintSet"

    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6f

    const/4 p3, 0x4

    goto :goto_70

    :cond_6f
    :goto_6f
    const/4 p3, -0x1

    :goto_70
    if-eqz p3, :cond_9d

    if-eq p3, v2, :cond_9d

    if-eq p3, v3, :cond_8c

    if-eq p3, v6, :cond_7f

    if-eq p3, v5, :cond_7b

    goto :goto_9d

    :cond_7b
    invoke-virtual {p0, p1, p2}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V

    goto :goto_9d

    :cond_7f
    new-instance p3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$〺つふすそ;

    invoke-direct {p3, p1, p2}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$〺つふすそ;-><init>(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V

    if-eqz v1, :cond_9d

    .line 2
    iget-object v2, v1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9d

    .line 3
    :cond_8c
    new-instance p3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$げつ〴ぬぐ;

    invoke-direct {p3, p1, p2}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$げつ〴ぬぐ;-><init>(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V

    iget-object v1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ;->びぐびあび:Landroid/util/SparseArray;

    iget v2, p3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    invoke-virtual {v1, v2, p3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object v1, p3

    goto :goto_9d

    :cond_9a
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    :cond_9d
    :goto_9d
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result p3
    :try_end_a1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_20 .. :try_end_a1} :catch_a2
    .catch Ljava/io/IOException; {:try_start_20 .. :try_end_a1} :catch_a2

    goto :goto_25

    :catch_a2
    :cond_a2
    return-void

    nop

    :sswitch_data_a4
    .sparse-switch
        -0x50764adb -> :sswitch_65
        0x4c7d471 -> :sswitch_5b
        0x526c4e31 -> :sswitch_51
        0x62ce7272 -> :sswitch_47
        0x7155a865 -> :sswitch_3d
    .end sparse-switch
.end method


# virtual methods
.method public 〺つふすそ(IFF)V
    .registers 7

    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ;->〺つふすそ:I

    const/4 v1, -0x1

    if-ne v0, p1, :cond_59

    if-ne p1, v1, :cond_f

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ;->びぐびあび:Landroid/util/SparseArray;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_15

    :cond_f
    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ;->びぐびあび:Landroid/util/SparseArray;

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    :goto_15
    check-cast p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$げつ〴ぬぐ;

    iget v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ;->くし〴〺ぅ:I

    if-eq v0, v1, :cond_2a

    iget-object v2, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$〺つふすそ;

    invoke-virtual {v0, p2, p3}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$〺つふすそ;->げつ〴ぬぐ(FF)Z

    move-result v0

    if-eqz v0, :cond_2a

    return-void

    :cond_2a
    invoke-virtual {p1, p2, p3}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ(FF)I

    move-result p2

    iget p3, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ;->くし〴〺ぅ:I

    if-ne p3, p2, :cond_33

    return-void

    :cond_33
    if-ne p2, v1, :cond_37

    const/4 p3, 0x0

    goto :goto_41

    :cond_37
    iget-object p3, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$〺つふすそ;

    iget-object p3, p3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$〺つふすそ;->なぎぱいぢぎ:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ;

    :goto_41
    if-ne p2, v1, :cond_44

    goto :goto_4e

    :cond_44
    iget-object p1, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$〺つふすそ;

    iget p1, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$〺つふすそ;->づざかべべ:I

    :goto_4e
    if-nez p3, :cond_51

    return-void

    :cond_51
    iput p2, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ;->くし〴〺ぅ:I

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ;->げつ〴ぬぐ:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p3, p1}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ;->〺つふすそ(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    goto :goto_85

    :cond_59
    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ;->〺つふすそ:I

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ;->びぐびあび:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {p1, p2, p3}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$げつ〴ぬぐ;->げつ〴ぬぐ(FF)I

    move-result p2

    if-ne p2, v1, :cond_6c

    iget-object p3, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ;

    goto :goto_76

    :cond_6c
    iget-object p3, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$〺つふすそ;

    iget-object p3, p3, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$〺つふすそ;->なぎぱいぢぎ:Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ;

    :goto_76
    if-ne p2, v1, :cond_79

    goto :goto_83

    :cond_79
    iget-object p1, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$〺つふすそ;

    iget p1, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ$〺つふすそ;->づざかべべ:I

    :goto_83
    if-nez p3, :cond_51

    :goto_85
    return-void
.end method

.method public final げつ〴ぬぐ(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V
    .registers 11

    new-instance v0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ;

    invoke-direct {v0}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ;-><init>()V

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_a
    if-ge v2, v1, :cond_5b

    invoke-interface {p2, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "id"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_58

    invoke-interface {p2, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, -0x1

    const/4 v5, 0x1

    if-eqz v2, :cond_3e

    const/16 v2, 0x2f

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    add-int/2addr v2, v5

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v2, v4, v7}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    goto :goto_3f

    :cond_3e
    const/4 v2, -0x1

    :goto_3f
    if-ne v2, v3, :cond_4f

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-le v3, v5, :cond_4f

    invoke-virtual {v1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    :cond_4f
    invoke-virtual {v0, p1, p2}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/くし〴〺ぅ;->ぺぁあねじ(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V

    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/〺つふすそ;->づざかべべ:Landroid/util/SparseArray;

    invoke-virtual {p1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_5b

    :cond_58
    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    :cond_5b
    :goto_5b
    return-void
.end method
