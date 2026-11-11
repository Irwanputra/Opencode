.class public Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/のぷのちつ/づざかべべ;


# instance fields
.field public final げつ〴ぬぐ:[Lづざかべべ/のぷのちつ/くし〴〺ぅ;


# direct methods
.method public constructor <init>([Lづざかべべ/のぷのちつ/くし〴〺ぅ;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;->げつ〴ぬぐ:[Lづざかべべ/のぷのちつ/くし〴〺ぅ;

    return-void
.end method


# virtual methods
.method public びぐびあび(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V
    .registers 9

    new-instance v0, Lづざかべべ/のぷのちつ/ぺふねづ〺;

    invoke-direct {v0}, Lづざかべべ/のぷのちつ/ぺふねづ〺;-><init>()V

    iget-object v1, p0, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;->げつ〴ぬぐ:[Lづざかべべ/のぷのちつ/くし〴〺ぅ;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_a
    if-ge v4, v2, :cond_14

    aget-object v5, v1, v4

    invoke-interface {v5, p1, p2, v3, v0}, Lづざかべべ/のぷのちつ/くし〴〺ぅ;->げつ〴ぬぐ(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;ZLづざかべべ/のぷのちつ/ぺふねづ〺;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_14
    iget-object v1, p0, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;->げつ〴ぬぐ:[Lづざかべべ/のぷのちつ/くし〴〺ぅ;

    array-length v2, v1

    :goto_17
    if-ge v3, v2, :cond_22

    aget-object v4, v1, v3

    const/4 v5, 0x1

    invoke-interface {v4, p1, p2, v5, v0}, Lづざかべべ/のぷのちつ/くし〴〺ぅ;->げつ〴ぬぐ(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;ZLづざかべべ/のぷのちつ/ぺふねづ〺;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_17

    :cond_22
    return-void
.end method
