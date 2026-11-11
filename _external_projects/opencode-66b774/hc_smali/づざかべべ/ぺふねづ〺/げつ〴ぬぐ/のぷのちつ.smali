.class public Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;
.super Lづざかべべ/のぷのちつ/ぇぬぎばつ;
.source ""


# static fields
.field public static final ぁごぐすすぃ:Lづざかべべ/のぷのちつ/ぉざぅち〻;


# instance fields
.field public final 〺つふすそ:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field public final くし〴〺ぅ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "L\u3065\u3056\u304b\u3079\u3079/\u307a\u3075\u306d\u3065\u303a/\u3052\u3064\u3034\u306c\u3050/\u306e\u3077\u306e\u3061\u3064;",
            ">;"
        }
    .end annotation
.end field

.field public final づざかべべ:Z

.field public なぎぱいぢぎ:Z

.field public final びぐびあび:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "L\u3065\u3056\u304b\u3079\u3079/\u306e\u3077\u306e\u3061\u3064/\u306f\u3032\u3071\u306a\u3067;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ$げつ〴ぬぐ;

    invoke-direct {v0}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ$げつ〴ぬぐ;-><init>()V

    sput-object v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->ぁごぐすすぃ:Lづざかべべ/のぷのちつ/ぉざぅち〻;

    return-void
.end method

.method public constructor <init>(Z)V
    .registers 3

    invoke-direct {p0}, Lづざかべべ/のぷのちつ/ぇぬぎばつ;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->〺つふすそ:Ljava/util/HashSet;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->くし〴〺ぅ:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->びぐびあび:Ljava/util/HashMap;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->なぎぱいぢぎ:Z

    iput-boolean p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->づざかべべ:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    const/4 v1, 0x0

    if-eqz p1, :cond_35

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_12

    goto :goto_35

    :cond_12
    check-cast p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;

    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->〺つふすそ:Ljava/util/HashSet;

    iget-object v3, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->〺つふすそ:Ljava/util/HashSet;

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_33

    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->くし〴〺ぅ:Ljava/util/HashMap;

    iget-object v3, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->くし〴〺ぅ:Ljava/util/HashMap;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_33

    iget-object v2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->びぐびあび:Ljava/util/HashMap;

    iget-object p1, p1, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->びぐびあび:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_33

    goto :goto_34

    :cond_33
    const/4 v0, 0x0

    :goto_34
    return v0

    :cond_35
    :goto_35
    return v1
.end method

.method public hashCode()I
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->〺つふすそ:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->くし〴〺ぅ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->びぐびあび:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FragmentManagerViewModel{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "} Fragments ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->〺つふすそ:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1d
    :goto_1d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, ", "

    if-eqz v2, :cond_36

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1d

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1d

    :cond_36
    const-string v1, ") Child Non Config ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->くし〴〺ぅ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_45
    :goto_45
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_45

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_45

    :cond_5e
    const-string v1, ") ViewModelStores ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->びぐびあび:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6d
    :goto_6d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_86

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6d

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_6d

    :cond_86
    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public 〺つふすそ(Landroidx/fragment/app/Fragment;)Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->〺つふすそ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x1

    if-nez p1, :cond_a

    return v0

    :cond_a
    iget-boolean p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->づざかべべ:Z

    if-eqz p1, :cond_11

    iget-boolean p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->なぎぱいぢぎ:Z

    return p1

    :cond_11
    return v0
.end method

.method public げつ〴ぬぐ()V
    .registers 2

    sget-object v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->せづっ〸ちね:Landroid/view/animation/Interpolator;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/のぷのちつ;->なぎぱいぢぎ:Z

    return-void
.end method
