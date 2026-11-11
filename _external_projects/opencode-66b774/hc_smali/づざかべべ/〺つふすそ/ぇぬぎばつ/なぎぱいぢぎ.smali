.class public Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;
.super Landroid/view/MenuInflater;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;,
        Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static final づざかべべ:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static final なぎぱいぢぎ:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# instance fields
.field public final 〺つふすそ:[Ljava/lang/Object;

.field public くし〴〺ぅ:Landroid/content/Context;

.field public final げつ〴ぬぐ:[Ljava/lang/Object;

.field public びぐびあび:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .registers 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Landroid/content/Context;

    aput-object v2, v0, v1

    sput-object v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;->づざかべべ:[Ljava/lang/Class;

    sput-object v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;->なぎぱいぢぎ:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    invoke-direct {p0, p1}, Landroid/view/MenuInflater;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/content/Context;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;->げつ〴ぬぐ:[Ljava/lang/Object;

    iput-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;->〺つふすそ:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public inflate(ILandroid/view/Menu;)V
    .registers 6

    const-string v0, "Error inflating menu XML"

    instance-of v1, p2, Lづざかべべ/〳ぜぞぜべっ/〳ぜぞぜべっ/げつ〴ぬぐ/げつ〴ぬぐ;

    if-nez v1, :cond_a

    invoke-super {p0, p1, p2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    return-void

    :cond_a
    const/4 v1, 0x0

    :try_start_b
    iget-object v2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getLayout(I)Landroid/content/res/XmlResourceParser;

    move-result-object v1

    invoke-static {v1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object p1

    invoke-virtual {p0, v1, p1, p2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;->〺つふすそ(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    :try_end_1c
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_b .. :try_end_1c} :catch_29
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_1c} :catch_22
    .catchall {:try_start_b .. :try_end_1c} :catchall_20

    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    return-void

    :catchall_20
    move-exception p1

    goto :goto_30

    :catch_22
    move-exception p1

    :try_start_23
    new-instance p2, Landroid/view/InflateException;

    invoke-direct {p2, v0, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_29
    move-exception p1

    new-instance p2, Landroid/view/InflateException;

    invoke-direct {p2, v0, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
    :try_end_30
    .catchall {:try_start_23 .. :try_end_30} :catchall_20

    :goto_30
    if-eqz v1, :cond_35

    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    :cond_35
    throw p1
.end method

.method public final 〺つふすそ(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    .registers 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    new-instance v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;

    move-object/from16 v3, p3

    invoke-direct {v2, v0, v3}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;-><init>(Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;Landroid/view/Menu;)V

    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v3

    :goto_f
    const/4 v4, 0x2

    const-string v5, "menu"

    const/4 v6, 0x1

    if-ne v3, v4, :cond_30

    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_24

    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    goto :goto_36

    :cond_24
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Expecting menu, got "

    invoke-static {v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_30
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    if-ne v3, v6, :cond_24f

    :goto_36
    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v11, v7

    :goto_3b
    if-nez v9, :cond_24e

    if-eq v3, v6, :cond_246

    const-string v12, "item"

    const-string v13, "group"

    if-eq v3, v4, :cond_ab

    const/4 v14, 0x3

    if-eq v3, v14, :cond_4a

    goto/16 :goto_229

    :cond_4a
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    if-eqz v10, :cond_5d

    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5d

    const/4 v3, 0x0

    move-object/from16 v12, p1

    move-object v11, v7

    const/4 v10, 0x0

    goto/16 :goto_240

    :cond_5d
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_71

    .line 1
    iput v8, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->〺つふすそ:I

    iput v8, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->くし〴〺ぅ:I

    iput v8, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->びぐびあび:I

    iput v8, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->づざかべべ:I

    iput-boolean v6, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->なぎぱいぢぎ:Z

    iput-boolean v6, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ぁごぐすすぃ:Z

    goto/16 :goto_229

    .line 2
    :cond_71
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9f

    .line 3
    iget-boolean v3, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->〳ぜぞぜべっ:Z

    if-nez v3, :cond_229

    .line 4
    iget-object v3, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->びえぁぜい:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ;

    if-eqz v3, :cond_8a

    invoke-virtual {v3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ;->げつ〴ぬぐ()Z

    move-result v3

    if-eqz v3, :cond_8a

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->げつ〴ぬぐ()Landroid/view/SubMenu;

    goto/16 :goto_229

    .line 5
    :cond_8a
    iput-boolean v6, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->〳ぜぞぜべっ:Z

    iget-object v3, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->げつ〴ぬぐ:Landroid/view/Menu;

    iget v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->〺つふすそ:I

    iget v13, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ぺぁあねじ:I

    iget v14, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->いいにぽつ:I

    iget-object v15, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ぺふねづ〺:Ljava/lang/CharSequence;

    invoke-interface {v3, v12, v13, v14, v15}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v3

    invoke-virtual {v2, v3}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->くし〴〺ぅ(Landroid/view/MenuItem;)V

    goto/16 :goto_229

    .line 6
    :cond_9f
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_229

    const/4 v3, 0x1

    move-object/from16 v12, p1

    const/4 v9, 0x1

    goto/16 :goto_240

    :cond_ab
    if-eqz v10, :cond_af

    goto/16 :goto_229

    :cond_af
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_f8

    .line 7
    iget-object v3, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ぺづげぺが:Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;

    iget-object v3, v3, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/content/Context;

    sget-object v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuGroup:[I

    invoke-virtual {v3, v1, v12}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v3

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuGroup_android_id:I

    invoke-virtual {v3, v12, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v12

    iput v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->〺つふすそ:I

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuGroup_android_menuCategory:I

    invoke-virtual {v3, v12, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v12

    iput v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->くし〴〺ぅ:I

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuGroup_android_orderInCategory:I

    invoke-virtual {v3, v12, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v12

    iput v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->びぐびあび:I

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuGroup_android_checkableBehavior:I

    invoke-virtual {v3, v12, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v12

    iput v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->づざかべべ:I

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuGroup_android_visible:I

    invoke-virtual {v3, v12, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v12

    iput-boolean v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->なぎぱいぢぎ:Z

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuGroup_android_enabled:I

    invoke-virtual {v3, v12, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v12

    iput-boolean v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ぁごぐすすぃ:Z

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    goto/16 :goto_229

    .line 8
    :cond_f8
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_22c

    .line 9
    iget-object v3, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ぺづげぺが:Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;

    iget-object v3, v3, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;->くし〴〺ぅ:Landroid/content/Context;

    sget-object v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem:[I

    invoke-static {v3, v1, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぉざぅち〻(Landroid/content/Context;Landroid/util/AttributeSet;[I)Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;

    move-result-object v3

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_android_id:I

    invoke-virtual {v3, v12, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result v12

    iput v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ぺぁあねじ:I

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_android_menuCategory:I

    iget v13, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->くし〴〺ぅ:I

    invoke-virtual {v3, v12, v13}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->いいにぽつ(II)I

    move-result v12

    sget v13, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_android_orderInCategory:I

    iget v14, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->びぐびあび:I

    invoke-virtual {v3, v13, v14}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->いいにぽつ(II)I

    move-result v13

    const/high16 v14, -0x10000

    and-int/2addr v12, v14

    const v14, 0xffff

    and-int/2addr v13, v14

    or-int/2addr v12, v13

    iput v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->いいにぽつ:I

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_android_title:I

    invoke-virtual {v3, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->おぐぴう〸ず(I)Ljava/lang/CharSequence;

    move-result-object v12

    iput-object v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ぺふねづ〺:Ljava/lang/CharSequence;

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_android_titleCondensed:I

    invoke-virtual {v3, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->おぐぴう〸ず(I)Ljava/lang/CharSequence;

    move-result-object v12

    iput-object v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->てぜきぽく:Ljava/lang/CharSequence;

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_android_icon:I

    invoke-virtual {v3, v12, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result v12

    iput v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->のぷのちつ:I

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_android_alphabeticShortcut:I

    invoke-virtual {v3, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->へぬ〴づぞ(I)Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_14c

    const/4 v12, 0x0

    goto :goto_150

    .line 10
    :cond_14c
    invoke-virtual {v12, v8}, Ljava/lang/String;->charAt(I)C

    move-result v12

    .line 11
    :goto_150
    iput-char v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->へぬ〴づぞ:C

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_alphabeticModifiers:I

    const/16 v13, 0x1000

    invoke-virtual {v3, v12, v13}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->いいにぽつ(II)I

    move-result v12

    iput v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->おぐぴう〸ず:I

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_android_numericShortcut:I

    invoke-virtual {v3, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->へぬ〴づぞ(I)Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_166

    const/4 v12, 0x0

    goto :goto_16a

    .line 12
    :cond_166
    invoke-virtual {v12, v8}, Ljava/lang/String;->charAt(I)C

    move-result v12

    .line 13
    :goto_16a
    iput-char v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ぇぬぎばつ:C

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_numericModifiers:I

    invoke-virtual {v3, v12, v13}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->いいにぽつ(II)I

    move-result v12

    iput v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ぉざぅち〻:I

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_android_checkable:I

    invoke-virtual {v3, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v13

    if-eqz v13, :cond_181

    invoke-virtual {v3, v12, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->げつ〴ぬぐ(IZ)Z

    move-result v12

    goto :goto_183

    :cond_181
    iget v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->づざかべべ:I

    :goto_183
    iput v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ざとぅぼこ〺:I

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_android_checked:I

    invoke-virtual {v3, v12, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->げつ〴ぬぐ(IZ)Z

    move-result v12

    iput-boolean v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->は〲ぱなで:Z

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_android_visible:I

    iget-boolean v13, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->なぎぱいぢぎ:Z

    invoke-virtual {v3, v12, v13}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->げつ〴ぬぐ(IZ)Z

    move-result v12

    iput-boolean v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ごづごきえ:Z

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_android_enabled:I

    iget-boolean v13, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ぁごぐすすぃ:Z

    invoke-virtual {v3, v12, v13}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->げつ〴ぬぐ(IZ)Z

    move-result v12

    iput-boolean v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ざっざへづ:Z

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_showAsAction:I

    const/4 v13, -0x1

    invoke-virtual {v3, v12, v13}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->いいにぽつ(II)I

    move-result v12

    iput v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->でどあくず:I

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_android_onClick:I

    invoke-virtual {v3, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->へぬ〴づぞ(I)Ljava/lang/String;

    move-result-object v12

    iput-object v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ぇ〳〲〺すっ:Ljava/lang/String;

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_actionLayout:I

    invoke-virtual {v3, v12, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result v12

    iput v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ぶでにく〼〳:I

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_actionViewClass:I

    invoke-virtual {v3, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->へぬ〴づぞ(I)Ljava/lang/String;

    move-result-object v12

    iput-object v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->〻ぞまぎな〻:Ljava/lang/String;

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_actionProviderClass:I

    invoke-virtual {v3, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->へぬ〴づぞ(I)Ljava/lang/String;

    move-result-object v12

    iput-object v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ぉ〲なぱぽた:Ljava/lang/String;

    if-eqz v12, :cond_1ce

    const/4 v14, 0x1

    goto :goto_1cf

    :cond_1ce
    const/4 v14, 0x0

    :goto_1cf
    if-eqz v14, :cond_1e8

    iget v14, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ぶでにく〼〳:I

    if-nez v14, :cond_1e8

    iget-object v14, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->〻ぞまぎな〻:Ljava/lang/String;

    if-nez v14, :cond_1e8

    sget-object v14, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;->なぎぱいぢぎ:[Ljava/lang/Class;

    iget-object v15, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ぺづげぺが:Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;

    iget-object v15, v15, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;->〺つふすそ:[Ljava/lang/Object;

    invoke-virtual {v2, v12, v14, v15}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->〺つふすそ(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ;

    iput-object v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->びえぁぜい:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ;

    goto :goto_1ea

    :cond_1e8
    iput-object v7, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->びえぁぜい:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ;

    :goto_1ea
    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_contentDescription:I

    invoke-virtual {v3, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->おぐぴう〸ず(I)Ljava/lang/CharSequence;

    move-result-object v12

    iput-object v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->なぶひせが:Ljava/lang/CharSequence;

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_tooltipText:I

    invoke-virtual {v3, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->おぐぴう〸ず(I)Ljava/lang/CharSequence;

    move-result-object v12

    iput-object v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->どぇぞほだ:Ljava/lang/CharSequence;

    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_iconTintMode:I

    invoke-virtual {v3, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v14

    if-eqz v14, :cond_20f

    invoke-virtual {v3, v12, v13}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->いいにぽつ(II)I

    move-result v12

    iget-object v13, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->じぜこほぱ:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v12, v13}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇぬぎばつ;->びぐびあび(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v12

    iput-object v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->じぜこほぱ:Landroid/graphics/PorterDuff$Mode;

    goto :goto_211

    :cond_20f
    iput-object v7, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->じぜこほぱ:Landroid/graphics/PorterDuff$Mode;

    :goto_211
    sget v12, Lづざかべべ/〺つふすそ/いいにぽつ;->MenuItem_iconTint:I

    invoke-virtual {v3, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぇぬぎばつ(I)Z

    move-result v13

    if-eqz v13, :cond_220

    invoke-virtual {v3, v12}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->くし〴〺ぅ(I)Landroid/content/res/ColorStateList;

    move-result-object v12

    iput-object v12, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ぅみぱぎぎ:Landroid/content/res/ColorStateList;

    goto :goto_222

    :cond_220
    iput-object v7, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->ぅみぱぎぎ:Landroid/content/res/ColorStateList;

    .line 14
    :goto_222
    iget-object v3, v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 15
    iput-boolean v8, v2, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->〳ぜぞぜべっ:Z

    :cond_229
    :goto_229
    move-object/from16 v12, p1

    goto :goto_240

    .line 16
    :cond_22c
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_23c

    invoke-virtual {v2}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ$〺つふすそ;->げつ〴ぬぐ()Landroid/view/SubMenu;

    move-result-object v3

    move-object/from16 v12, p1

    invoke-virtual {v0, v12, v1, v3}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;->〺つふすそ(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V

    goto :goto_240

    :cond_23c
    move-object/from16 v12, p1

    const/4 v10, 0x1

    move-object v11, v3

    :goto_240
    invoke-interface/range {p1 .. p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    goto/16 :goto_3b

    :cond_246
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unexpected end of document"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_24e
    return-void

    :cond_24f
    move-object/from16 v12, p1

    goto/16 :goto_f
.end method

.method public final げつ〴ぬぐ(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_5

    return-object p1

    :cond_5
    instance-of v0, p1, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_13

    check-cast p1, Landroid/content/ContextWrapper;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/なぎぱいぢぎ;->げつ〴ぬぐ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :cond_13
    return-object p1
.end method
