.class public Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;
.super Lづざかべべ/のぷのちつ/びぐびあび;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〺つふすそ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

.field public ぁごぐすすぃ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u3073\u3050\u3073\u3042\u3073$\u303a\u3064\u3075\u3059\u305d;",
            ">;"
        }
    .end annotation
.end field

.field public final くし〴〺ぅ:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u3041\u3054\u3050\u3059\u3059\u3043;",
            ">;"
        }
    .end annotation
.end field

.field public げつ〴ぬぐ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u304f\u3057\u3034\u303a\u3045/\u3052\u3064\u3034\u306c\u3050/\u303a\u3064\u3075\u3059\u305d/\u3052\u3064\u3034\u306c\u3050<",
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u306a\u304e\u3071\u3044\u3062\u304e;",
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u3033\u305c\u305e\u305c\u3079\u3063$\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field

.field public づざかべべ:Z

.field public なぎぱいぢぎ:Z

.field public びぐびあび:I


# direct methods
.method public constructor <init>(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;)V
    .registers 3

    invoke-direct {p0}, Lづざかべべ/のぷのちつ/びぐびあび;-><init>()V

    new-instance v0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    invoke-direct {v0}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;-><init>()V

    iput-object v0, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    const/4 v0, 0x0

    iput v0, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->びぐびあび:I

    iput-boolean v0, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->づざかべべ:Z

    iput-boolean v0, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->なぎぱいぢぎ:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->ぁごぐすすぃ:Ljava/util/ArrayList;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->くし〴〺ぅ:Ljava/lang/ref/WeakReference;

    sget-object p1, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->くし〴〺ぅ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    iput-object p1, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    return-void
.end method

.method public static くし〴〺ぅ(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;
    .registers 4

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_35

    const/4 v1, 0x1

    if-eq v0, v1, :cond_32

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2f

    const/4 v1, 0x3

    if-eq v0, v1, :cond_32

    const/4 v1, 0x4

    if-eq v0, v1, :cond_35

    const/4 v1, 0x5

    if-ne v0, v1, :cond_18

    sget-object p0, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->〺つふすそ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    return-object p0

    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected event value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2f
    sget-object p0, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->なぎぱいぢぎ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    return-object p0

    :cond_32
    sget-object p0, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->づざかべべ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    return-object p0

    :cond_35
    sget-object p0, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->びぐびあび:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    return-object p0
.end method

.method public static づざかべべ(Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;
    .registers 3

    if-eqz p1, :cond_9

    invoke-virtual {p1, p0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_9

    move-object p0, p1

    :cond_9
    return-object p0
.end method

.method public static ぺぁあねじ(Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;
    .registers 4

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_35

    const/4 v1, 0x1

    if-eq v0, v1, :cond_35

    const/4 v1, 0x2

    if-eq v0, v1, :cond_32

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2f

    const/4 v1, 0x4

    if-eq v0, v1, :cond_29

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected state value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_29
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :cond_2f
    sget-object p0, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_RESUME:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    return-object p0

    :cond_32
    sget-object p0, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_START:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    return-object p0

    :cond_35
    sget-object p0, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_CREATE:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    return-object p0
.end method


# virtual methods
.method public final 〳ぜぞぜべっ()V
    .registers 9

    iget-object v0, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->くし〴〺ぅ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/のぷのちつ/ぁごぐすすぃ;

    if-eqz v0, :cond_133

    .line 1
    :cond_a
    iget-object v1, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    .line 2
    iget v2, v1, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->づざかべべ:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_13

    goto :goto_29

    .line 3
    :cond_13
    iget-object v2, v1, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    .line 4
    iget-object v2, v2, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;->くし〴〺ぅ:Ljava/lang/Object;

    .line 5
    check-cast v2, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;

    iget-object v2, v2, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    .line 6
    iget-object v5, v1, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    .line 7
    iget-object v5, v5, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;->くし〴〺ぅ:Ljava/lang/Object;

    .line 8
    check-cast v5, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;

    iget-object v5, v5, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    if-ne v2, v5, :cond_2b

    iget-object v2, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    if-ne v2, v5, :cond_2b

    :goto_29
    const/4 v2, 0x1

    goto :goto_2c

    :cond_2b
    const/4 v2, 0x0

    .line 9
    :goto_2c
    iput-boolean v3, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->なぎぱいぢぎ:Z

    if-nez v2, :cond_132

    iget-object v2, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    .line 10
    iget-object v1, v1, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    .line 11
    iget-object v1, v1, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;->くし〴〺ぅ:Ljava/lang/Object;

    .line 12
    check-cast v1, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;

    iget-object v1, v1, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-virtual {v2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-gez v1, :cond_d0

    .line 13
    iget-object v1, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    .line 14
    new-instance v2, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$〺つふすそ;

    iget-object v3, v1, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    iget-object v5, v1, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->〺つふすそ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    invoke-direct {v2, v3, v5}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$〺つふすそ;-><init>(Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;)V

    iget-object v1, v1, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->びぐびあび:Ljava/util/WeakHashMap;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    :cond_52
    invoke-virtual {v2}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d0

    iget-boolean v1, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->なぎぱいぢぎ:Z

    if-nez v1, :cond_d0

    invoke-virtual {v2}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$づざかべべ;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;

    :goto_68
    iget-object v5, v3, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    iget-object v6, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-lez v5, :cond_52

    iget-boolean v5, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->なぎぱいぢぎ:Z

    if-nez v5, :cond_52

    iget-object v5, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_52

    iget-object v5, v3, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    .line 16
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eqz v6, :cond_ca

    if-eq v6, v4, :cond_c4

    const/4 v7, 0x2

    if-eq v6, v7, :cond_b2

    const/4 v7, 0x3

    if-eq v6, v7, :cond_af

    const/4 v7, 0x4

    if-ne v6, v7, :cond_98

    sget-object v5, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_PAUSE:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    goto :goto_b4

    :cond_98
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected state value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_af
    sget-object v5, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_STOP:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    goto :goto_b4

    :cond_b2
    sget-object v5, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_DESTROY:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    .line 17
    :goto_b4
    invoke-static {v5}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->くし〴〺ぅ(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    move-result-object v6

    .line 18
    iget-object v7, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    invoke-virtual {v3, v0, v5}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    invoke-virtual {p0}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->ぁごぐすすぃ()V

    goto :goto_68

    .line 20
    :cond_c4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_ca
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 21
    :cond_d0
    iget-object v1, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    .line 22
    iget-object v1, v1, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->くし〴〺ぅ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    .line 23
    iget-boolean v2, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->なぎぱいぢぎ:Z

    if-nez v2, :cond_a

    if-eqz v1, :cond_a

    iget-object v2, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    .line 24
    iget-object v1, v1, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;->くし〴〺ぅ:Ljava/lang/Object;

    .line 25
    check-cast v1, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;

    iget-object v1, v1, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-virtual {v2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-lez v1, :cond_a

    .line 26
    iget-object v1, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    invoke-virtual {v1}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->〺つふすそ()Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;

    move-result-object v1

    :cond_ee
    invoke-virtual {v1}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    iget-boolean v2, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->なぎぱいぢぎ:Z

    if-nez v2, :cond_a

    invoke-virtual {v1}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$びぐびあび;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;

    :goto_104
    iget-object v4, v3, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    iget-object v5, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-gez v4, :cond_ee

    iget-boolean v4, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->なぎぱいぢぎ:Z

    if-nez v4, :cond_ee

    iget-object v4, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_ee

    iget-object v4, v3, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    .line 27
    iget-object v5, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    iget-object v4, v3, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-static {v4}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->ぺぁあねじ(Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    invoke-virtual {p0}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->ぁごぐすすぃ()V

    goto :goto_104

    :cond_132
    return-void

    .line 29
    :cond_133
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_13c

    :goto_13b
    throw v0

    :goto_13c
    goto :goto_13b
.end method

.method public final 〺つふすそ(Lづざかべべ/のぷのちつ/なぎぱいぢぎ;)Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;
    .registers 5

    iget-object v0, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    .line 1
    iget-object v1, v0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_16

    .line 2
    iget-object v0, v0, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    iget-object p1, p1, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;->づざかべべ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;

    goto :goto_17

    :cond_16
    move-object p1, v2

    :goto_17
    if-eqz p1, :cond_20

    .line 3
    iget-object p1, p1, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/〺つふすそ$くし〴〺ぅ;->くし〴〺ぅ:Ljava/lang/Object;

    .line 4
    check-cast p1, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;

    iget-object p1, p1, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    goto :goto_21

    :cond_20
    move-object p1, v2

    :goto_21
    iget-object v0, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_38

    iget-object v0, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    :cond_38
    iget-object v0, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-static {v0, p1}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->づざかべべ(Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    move-result-object p1

    invoke-static {p1, v2}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->づざかべべ(Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    move-result-object p1

    return-object p1
.end method

.method public final ぁごぐすすぃ()V
    .registers 3

    iget-object v0, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method public げつ〴ぬぐ(Lづざかべべ/のぷのちつ/なぎぱいぢぎ;)V
    .registers 8

    iget-object v0, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    sget-object v1, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->〺つふすそ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    if-ne v0, v1, :cond_7

    goto :goto_9

    :cond_7
    sget-object v1, Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;->くし〴〺ぅ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    :goto_9
    new-instance v0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;

    invoke-direct {v0, p1, v1}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;-><init>(Lづざかべべ/のぷのちつ/なぎぱいぢぎ;Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)V

    iget-object v1, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    invoke-virtual {v1, p1, v0}, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->づざかべべ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;

    if-eqz v1, :cond_19

    return-void

    :cond_19
    iget-object v1, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->くし〴〺ぅ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lづざかべべ/のぷのちつ/ぁごぐすすぃ;

    if-nez v1, :cond_24

    return-void

    :cond_24
    iget v2, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->びぐびあび:I

    const/4 v3, 0x1

    if-nez v2, :cond_30

    iget-boolean v2, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->づざかべべ:Z

    if-eqz v2, :cond_2e

    goto :goto_30

    :cond_2e
    const/4 v2, 0x0

    goto :goto_31

    :cond_30
    :goto_30
    const/4 v2, 0x1

    :goto_31
    invoke-virtual {p0, p1}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ(Lづざかべべ/のぷのちつ/なぎぱいぢぎ;)Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    move-result-object v4

    iget v5, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->びぐびあび:I

    add-int/2addr v5, v3

    iput v5, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->びぐびあび:I

    :goto_3a
    iget-object v5, v0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-virtual {v5, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-gez v4, :cond_64

    iget-object v4, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->げつ〴ぬぐ:Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    .line 1
    iget-object v4, v4, Lづざかべべ/くし〴〺ぅ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->なぎぱいぢぎ:Ljava/util/HashMap;

    invoke-virtual {v4, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_64

    .line 2
    iget-object v4, v0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    .line 3
    iget-object v5, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->ぁごぐすすぃ:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v4, v0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    invoke-static {v4}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->ぺぁあねじ(Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ$げつ〴ぬぐ;->げつ〴ぬぐ(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V

    invoke-virtual {p0}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->ぁごぐすすぃ()V

    invoke-virtual {p0, p1}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ(Lづざかべべ/のぷのちつ/なぎぱいぢぎ;)Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    move-result-object v4

    goto :goto_3a

    :cond_64
    if-nez v2, :cond_69

    invoke-virtual {p0}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->〳ぜぞぜべっ()V

    :cond_69
    iget p1, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->びぐびあび:I

    sub-int/2addr p1, v3

    iput p1, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->びぐびあび:I

    return-void
.end method

.method public final なぎぱいぢぎ(Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    if-ne v0, p1, :cond_5

    return-void

    :cond_5
    iput-object p1, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    iget-boolean p1, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->づざかべべ:Z

    const/4 v0, 0x1

    if-nez p1, :cond_1a

    iget p1, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->びぐびあび:I

    if-eqz p1, :cond_11

    goto :goto_1a

    :cond_11
    iput-boolean v0, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->づざかべべ:Z

    invoke-virtual {p0}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->〳ぜぞぜべっ()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->づざかべべ:Z

    return-void

    :cond_1a
    :goto_1a
    iput-boolean v0, p0, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->なぎぱいぢぎ:Z

    return-void
.end method

.method public びぐびあび(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V
    .registers 2

    invoke-static {p1}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->くし〴〺ぅ(Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;

    move-result-object p1

    invoke-virtual {p0, p1}, Lづざかべべ/のぷのちつ/〳ぜぞぜべっ;->なぎぱいぢぎ(Lづざかべべ/のぷのちつ/びぐびあび$〺つふすそ;)V

    return-void
.end method
