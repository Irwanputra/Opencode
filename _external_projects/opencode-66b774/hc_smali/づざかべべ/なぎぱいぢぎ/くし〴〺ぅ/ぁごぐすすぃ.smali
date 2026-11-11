.class public Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$〺つふすそ;,
        Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〺つふすそ:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u304f\u3057\u3034\u303a\u3045/\u3041\u3054\u3050\u3059\u3059\u3043$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field

.field public げつ〴ぬぐ:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V
    .registers 12

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ;->げつ〴ぬぐ:I

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iput-object v1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ;->〺つふすそ:Landroid/util/SparseArray;

    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 1
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v1

    sget-object v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->StateSet:[I

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_22
    if-ge v4, v2, :cond_37

    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v5

    sget v6, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/なぎぱいぢぎ;->StateSet_defaultState:I

    if-ne v5, v6, :cond_34

    iget v6, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ;->げつ〴ぬぐ:I

    invoke-virtual {v1, v5, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    iput v5, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ;->げつ〴ぬぐ:I

    :cond_34
    add-int/lit8 v4, v4, 0x1

    goto :goto_22

    :cond_37
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    const/4 v1, 0x0

    :try_start_3b
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2
    :try_end_3f
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3b .. :try_end_3f} :catch_b7
    .catch Ljava/io/IOException; {:try_start_3b .. :try_end_3f} :catch_b7

    :goto_3f
    const/4 v4, 0x1

    if-eq v2, v4, :cond_b7

    if-eqz v2, :cond_af

    const-string v5, "StateSet"

    const/4 v6, 0x3

    const/4 v7, 0x2

    if-eq v2, v7, :cond_59

    if-eq v2, v6, :cond_4e

    goto/16 :goto_b2

    :cond_4e
    :try_start_4e
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b2

    goto :goto_b7

    :cond_59
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_b8

    goto :goto_8b

    :sswitch_65
    const-string v5, "Variant"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8b

    const/4 v2, 0x3

    goto :goto_8c

    :sswitch_6f
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8b

    const/4 v2, 0x1

    goto :goto_8c

    :sswitch_77
    const-string v5, "LayoutDescription"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8b

    const/4 v2, 0x0

    goto :goto_8c

    :sswitch_81
    const-string v5, "State"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8b

    const/4 v2, 0x2

    goto :goto_8c

    :cond_8b
    :goto_8b
    const/4 v2, -0x1

    :goto_8c
    if-eqz v2, :cond_b2

    if-eq v2, v4, :cond_b2

    if-eq v2, v7, :cond_a2

    if-eq v2, v6, :cond_95

    goto :goto_b2

    :cond_95
    new-instance v2, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$〺つふすそ;

    invoke-direct {v2, p1, p2}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$〺つふすそ;-><init>(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V

    if-eqz v1, :cond_b2

    .line 2
    iget-object v4, v1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b2

    .line 3
    :cond_a2
    new-instance v1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;

    invoke-direct {v1, p1, p2}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;-><init>(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V

    iget-object v2, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ;->〺つふすそ:Landroid/util/SparseArray;

    iget v4, v1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    invoke-virtual {v2, v4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_b2

    :cond_af
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    :cond_b2
    :goto_b2
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2
    :try_end_b6
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_4e .. :try_end_b6} :catch_b7
    .catch Ljava/io/IOException; {:try_start_4e .. :try_end_b6} :catch_b7

    goto :goto_3f

    :catch_b7
    :cond_b7
    :goto_b7
    return-void

    :sswitch_data_b8
    .sparse-switch
        0x4c7d471 -> :sswitch_81
        0x4d92b252 -> :sswitch_77
        0x526c4e31 -> :sswitch_6f
        0x7155a865 -> :sswitch_65
    .end sparse-switch
.end method


# virtual methods
.method public げつ〴ぬぐ(III)I
    .registers 6

    int-to-float p2, p2

    int-to-float p3, p3

    const/4 v0, -0x1

    if-ne v0, p1, :cond_32

    if-ne p1, v0, :cond_f

    .line 1
    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ;->〺つふすそ:Landroid/util/SparseArray;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_15

    :cond_f
    iget-object p1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ;->〺つふすそ:Landroid/util/SparseArray;

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    :goto_15
    check-cast p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;

    if-nez p1, :cond_1a

    goto :goto_44

    :cond_1a
    invoke-virtual {p1, p2, p3}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;->げつ〴ぬぐ(FF)I

    move-result p2

    if-ne v0, p2, :cond_21

    goto :goto_44

    :cond_21
    if-ne p2, v0, :cond_26

    :goto_23
    iget p1, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;->くし〴〺ぅ:I

    goto :goto_30

    :cond_26
    iget-object p1, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$〺つふすそ;

    iget p1, p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$〺つふすそ;->づざかべべ:I

    :goto_30
    move v0, p1

    goto :goto_44

    :cond_32
    iget-object v1, p0, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ;->〺つふすそ:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;

    if-nez p1, :cond_3d

    goto :goto_44

    :cond_3d
    invoke-virtual {p1, p2, p3}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/ぁごぐすすぃ$げつ〴ぬぐ;->げつ〴ぬぐ(FF)I

    move-result p2

    if-ne p2, v0, :cond_26

    goto :goto_23

    :goto_44
    return v0
.end method
