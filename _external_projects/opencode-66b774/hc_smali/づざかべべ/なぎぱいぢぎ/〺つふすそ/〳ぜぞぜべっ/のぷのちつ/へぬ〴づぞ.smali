.class public Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static なぎぱいぢぎ:I


# instance fields
.field public 〺つふすそ:I

.field public くし〴〺ぅ:I

.field public げつ〴ぬぐ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3033\u305c\u305e\u305c\u3079\u3063/\u3073\u3050\u3073\u3042\u3073;",
            ">;"
        }
    .end annotation
.end field

.field public づざかべべ:I

.field public びぐびあび:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3033\u305c\u305e\u305c\u3079\u3063/\u306e\u3077\u306e\u3061\u3064/\u3078\u306c\u3034\u3065\u305e$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    const/4 v0, -0x1

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->〺つふすそ:I

    const/4 v1, 0x0

    iput v1, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->くし〴〺ぅ:I

    const/4 v1, 0x0

    iput-object v1, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->びぐびあび:Ljava/util/ArrayList;

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->づざかべべ:I

    sget v0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->なぎぱいぢぎ:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->なぎぱいぢぎ:I

    iput v0, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->〺つふすそ:I

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->くし〴〺ぅ:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1
    iget v1, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->くし〴〺ぅ:I

    if-nez v1, :cond_c

    const-string v1, "Horizontal"

    goto :goto_1a

    :cond_c
    const/4 v2, 0x1

    if-ne v1, v2, :cond_12

    const-string v1, "Vertical"

    goto :goto_1a

    :cond_12
    const/4 v2, 0x2

    if-ne v1, v2, :cond_18

    const-string v1, "Both"

    goto :goto_1a

    :cond_18
    const-string v1, "Unknown"

    .line 2
    :goto_1a
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->〺つふすそ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] <"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_36
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_52

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;

    const-string v3, " "

    invoke-static {v0, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->いいにぽつ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 3
    iget-object v2, v2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;->ぇいうげ〱〹:Ljava/lang/String;

    .line 4
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_36

    :cond_52
    const-string v1, " >"

    invoke-static {v0, v1}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぷぞてのほき(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public 〺つふすそ(Ljava/util/ArrayList;)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3033\u305c\u305e\u305c\u3079\u3063/\u306e\u3077\u306e\u3061\u3064/\u3078\u306c\u3034\u3065\u305e;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->づざかべべ:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_28

    if-lez v0, :cond_28

    const/4 v1, 0x0

    :goto_e
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_28

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;

    iget v3, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->づざかべべ:I

    iget v4, v2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->〺つふすそ:I

    if-ne v3, v4, :cond_25

    iget v3, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->くし〴〺ぅ:I

    invoke-virtual {p0, v3, v2}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->びぐびあび(ILづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;)V

    :cond_25
    add-int/lit8 v1, v1, 0x1

    goto :goto_e

    :cond_28
    if-nez v0, :cond_2d

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_2d
    return-void
.end method

.method public くし〴〺ぅ(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/びぐびあび;I)I
    .registers 8

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_a

    return v1

    :cond_a
    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    .line 1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;

    .line 2
    iget-object v2, v2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;->ち〴みぎ〻び:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;

    .line 3
    check-cast v2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/づざかべべ;

    invoke-virtual {p1}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->ざっざへづ()V

    invoke-virtual {v2, p1, v1}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;->なぎぱいぢぎ(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/びぐびあび;Z)V

    const/4 v3, 0x0

    :goto_1d
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_2f

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;

    invoke-virtual {v4, p1, v1}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;->なぎぱいぢぎ(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/びぐびあび;Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1d

    :cond_2f
    if-nez p2, :cond_38

    iget v3, v2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/づざかべべ;->ごまぉてう:I

    if-lez v3, :cond_38

    invoke-static {v2, p1, v0, v1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〺つふすそ(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/づざかべべ;Lづざかべべ/なぎぱいぢぎ/〺つふすそ/びぐびあび;Ljava/util/ArrayList;I)V

    :cond_38
    const/4 v3, 0x1

    if-ne p2, v3, :cond_42

    iget v4, v2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/づざかべべ;->ぷちぅぐね:I

    if-lez v4, :cond_42

    invoke-static {v2, p1, v0, v3}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〺つふすそ(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/づざかべべ;Lづざかべべ/なぎぱいぢぎ/〺つふすそ/びぐびあび;Ljava/util/ArrayList;I)V

    :cond_42
    :try_start_42
    invoke-virtual {p1}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->ぉざぅち〻()V
    :try_end_45
    .catch Ljava/lang/Exception; {:try_start_42 .. :try_end_45} :catch_45

    :catch_45
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->びぐびあび:Ljava/util/ArrayList;

    :goto_4c
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_65

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;

    new-instance v4, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ$げつ〴ぬぐ;

    invoke-direct {v4, p0, v3, p1, p2}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ$げつ〴ぬぐ;-><init>(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;Lづざかべべ/なぎぱいぢぎ/〺つふすそ/びぐびあび;I)V

    iget-object v3, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->びぐびあび:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_4c

    :cond_65
    if-nez p2, :cond_70

    iget-object p2, v2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;->ぺづげぺが:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/くし〴〺ぅ;

    invoke-virtual {p1, p2}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->おぐぴう〸ず(Ljava/lang/Object;)I

    move-result p2

    iget-object v0, v2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;->せづっ〸ちね:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/くし〴〺ぅ;

    goto :goto_78

    :cond_70
    iget-object p2, v2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;->ぉひのべい:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/くし〴〺ぅ;

    invoke-virtual {p1, p2}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->おぐぴう〸ず(Ljava/lang/Object;)I

    move-result p2

    iget-object v0, v2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;->ぷぞてのほき:Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/くし〴〺ぅ;

    :goto_78
    invoke-virtual {p1, v0}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->おぐぴう〸ず(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p1}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/びぐびあび;->ざっざへづ()V

    sub-int/2addr v0, p2

    return v0
.end method

.method public げつ〴ぬぐ(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;)Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 p1, 0x0

    return p1

    :cond_a
    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public びぐびあび(ILづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;)V
    .registers 6

    iget-object v0, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->げつ〴ぬぐ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;

    invoke-virtual {p2, v1}, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->げつ〴ぬぐ(Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;)Z

    if-nez p1, :cond_1c

    .line 1
    iget v2, p2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->〺つふすそ:I

    .line 2
    iput v2, v1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;->ひぞ〴つき:I

    goto :goto_6

    .line 3
    :cond_1c
    iget v2, p2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->〺つふすそ:I

    .line 4
    iput v2, v1, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/びぐびあび;->のかまじえ:I

    goto :goto_6

    :cond_21
    iget p1, p2, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->〺つふすそ:I

    iput p1, p0, Lづざかべべ/なぎぱいぢぎ/〺つふすそ/〳ぜぞぜべっ/のぷのちつ/へぬ〴づぞ;->づざかべべ:I

    return-void
.end method
