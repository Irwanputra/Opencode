.class public Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぁごぐすすぃ;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static 〺つふすそ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Constructor<",
            "+",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field public げつ〴ぬぐ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u303a\u3064\u3075\u3059\u305d;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .registers 5

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぁごぐすすぃ;->〺つふすそ:Ljava/util/HashMap;

    :try_start_7
    const-string v1, "KeyAttribute"

    const-class v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/くし〴〺ぅ;

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぁごぐすすぃ;->〺つふすそ:Ljava/util/HashMap;

    const-string v1, "KeyPosition"

    const-class v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/〳ぜぞぜべっ;

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぁごぐすすぃ;->〺つふすそ:Ljava/util/HashMap;

    const-string v1, "KeyCycle"

    const-class v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/づざかべべ;

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぁごぐすすぃ;->〺つふすそ:Ljava/util/HashMap;

    const-string v1, "KeyTimeCycle"

    const-class v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/いいにぽつ;

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぁごぐすすぃ;->〺つふすそ:Ljava/util/HashMap;

    const-string v1, "KeyTrigger"

    const-class v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぺふねづ〺;

    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_51
    .catch Ljava/lang/NoSuchMethodException; {:try_start_7 .. :try_end_51} :catch_51

    :catch_51
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぁごぐすすぃ;->げつ〴ぬぐ:Ljava/util/HashMap;

    :try_start_a
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    const/4 v1, 0x0

    :goto_f
    const/4 v2, 0x1

    if-eq v0, v2, :cond_65

    const/4 v2, 0x2

    if-eq v0, v2, :cond_26

    const/4 v2, 0x3

    if-eq v0, v2, :cond_19

    goto :goto_60

    :cond_19
    const-string v0, "KeyFrameSet"

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_60

    return-void

    :cond_26
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぁごぐすすぃ;->〺つふすそ:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2
    :try_end_30
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_a .. :try_end_30} :catch_65
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_30} :catch_65

    if-eqz v2, :cond_4f

    :try_start_32
    sget-object v2, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぁごぐすすぃ;->〺つふすそ:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;
    :try_end_43
    .catch Ljava/lang/Exception; {:try_start_32 .. :try_end_43} :catch_60

    :try_start_43
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->くし〴〺ぅ(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p0, v0}, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぁごぐすすぃ;->〺つふすそ(Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;)V
    :try_end_4d
    .catch Ljava/lang/Exception; {:try_start_43 .. :try_end_4d} :catch_4d

    :catch_4d
    move-object v1, v0

    goto :goto_60

    :cond_4f
    :try_start_4f
    const-string v2, "CustomAttribute"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_60

    if-eqz v1, :cond_60

    iget-object v0, v1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->びぐびあび:Ljava/util/HashMap;

    if-eqz v0, :cond_60

    invoke-static {p1, p2, v0}, Lづざかべべ/なぎぱいぢぎ/くし〴〺ぅ/げつ〴ぬぐ;->づざかべべ(Landroid/content/Context;Lorg/xmlpull/v1/XmlPullParser;Ljava/util/HashMap;)V

    :catch_60
    :cond_60
    :goto_60
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0
    :try_end_64
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_4f .. :try_end_64} :catch_65
    .catch Ljava/io/IOException; {:try_start_4f .. :try_end_64} :catch_65

    goto :goto_f

    :catch_65
    :cond_65
    return-void
.end method


# virtual methods
.method public final 〺つふすそ(Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;)V
    .registers 5

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぁごぐすすぃ;->げつ〴ぬぐ:Ljava/util/HashMap;

    iget v1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->〺つふすそ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぁごぐすすぃ;->げつ〴ぬぐ:Ljava/util/HashMap;

    iget v1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->〺つふすそ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1e
    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぁごぐすすぃ;->げつ〴ぬぐ:Ljava/util/HashMap;

    iget v1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->〺つふすそ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public げつ〴ぬぐ(Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;)V
    .registers 6

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぁごぐすすぃ;->げつ〴ぬぐ:Ljava/util/HashMap;

    iget v1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->〺つふすそ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_15

    .line 1
    iget-object v1, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->でどあくず:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 2
    :cond_15
    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/ぁごぐすすぃ;->げつ〴ぬぐ:Ljava/util/HashMap;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_53

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_28
    :goto_28
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_53

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;

    iget-object v2, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    iget-object v2, v2, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->ごまけがぢは:Ljava/lang/String;

    .line 3
    iget-object v3, v1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->くし〴〺ぅ:Ljava/lang/String;

    if-eqz v3, :cond_4a

    if-nez v2, :cond_45

    goto :goto_4a

    :cond_45
    invoke-virtual {v2, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v2

    goto :goto_4b

    :cond_4a
    :goto_4a
    const/4 v2, 0x0

    :goto_4b
    if-eqz v2, :cond_28

    .line 4
    iget-object v2, p1, Lづざかべべ/なぎぱいぢぎ/げつ〴ぬぐ/〺つふすそ/のぷのちつ;->でどあくず:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_28

    :cond_53
    return-void
.end method
