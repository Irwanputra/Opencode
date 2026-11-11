.class public Landroidx/savedstate/SavedStateRegistry$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/のぷのちつ/づざかべべ;


# instance fields
.field public final synthetic げつ〴ぬぐ:Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;)V
    .registers 2

    iput-object p1, p0, Landroidx/savedstate/SavedStateRegistry$1;->げつ〴ぬぐ:Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public びぐびあび(Lづざかべべ/のぷのちつ/ぁごぐすすぃ;Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;)V
    .registers 3

    sget-object p1, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_START:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    if-ne p2, p1, :cond_a

    :goto_4
    iget-object p1, p0, Landroidx/savedstate/SavedStateRegistry$1;->げつ〴ぬぐ:Lづざかべべ/ぉざぅち〻/げつ〴ぬぐ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_f

    :cond_a
    sget-object p1, Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;->ON_STOP:Lづざかべべ/のぷのちつ/びぐびあび$げつ〴ぬぐ;

    if-ne p2, p1, :cond_f

    goto :goto_4

    :cond_f
    :goto_f
    return-void
.end method
